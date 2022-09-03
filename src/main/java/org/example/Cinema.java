package org.example;

import java.util.Scanner;

public class Cinema {

    static class MyCinema {
        int rows = 0;
        int seats = 0;
        int actualIncome = 0;
        int totalIncome = 0;
        String[][] cinemaRoom = new String[rows][seats];

        public MyCinema(int rows, int seats, int actualIncome, int totalIncome, String[][] cinemaRoom) {
            this.actualIncome = actualIncome;
            this.totalIncome = totalIncome;
            this.rows = rows;
            this.seats = seats;
            this.cinemaRoom = cinemaRoom;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int cinemaRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int cinemaSeats = scanner.nextInt();

        MyCinema cinema = new MyCinema(
                cinemaRows,
                cinemaSeats,
                0,
                0,
                new String[cinemaRows][cinemaSeats]
        );

        fillCinemaWithSeats(cinema);

    }

    public static void menu(MyCinema cinema) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");

        switch (scanner.nextInt()) {
            case 0:
                return;
            case 1:
                printSeats(cinema);
                break;
            case 2:
                buyTicket(cinema);
                break;
            case 3:
                statistics(cinema);
                break;
            default:
                System.out.println("Wrong number!");
                menu(cinema);
                break;
        }
    }


    public static void printSeats(MyCinema cinema) {

        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 0; i < cinema.cinemaRoom[0].length; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < cinema.cinemaRoom.length; i++) {
            System.out.print(i + 1 + "");
            for (int j = 0; j < cinema.cinemaRoom[0].length; j++) {
                System.out.print(" " + cinema.cinemaRoom[i][j]);
            }
            System.out.println();
        }
        menu(cinema);
    }


    public static void buyTicket(MyCinema cinema) {

        Scanner scanner = new Scanner(System.in);

        int basicPrice = 10;
        int priceFirstHalf = 10;
        int priceSecondHalf = 8;

        System.out.println("Enter a row number:");
        int requestedRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int requestedSeat = scanner.nextInt();

        if (requestedRow > cinema.rows || requestedSeat > cinema.seats) {
            System.out.println("Wrong input!");
            buyTicket(cinema);
        } else {
            if (cinema.cinemaRoom[requestedRow - 1][requestedSeat - 1].equals("B")) {
                System.out.println("That ticket has already been purchased!");
                buyTicket(cinema);
            } else {
                if (cinema.rows * cinema.seats < 60) {
                    System.out.println("Ticket price: $" + basicPrice);
                    cinema.actualIncome += basicPrice;
                    cinema.totalIncome = cinema.rows * cinema.seats * 10;
                } else if (cinema.rows * cinema.seats > 60) {
                    if (requestedRow > cinema.rows / 2) {
                        System.out.println("Ticket price: $" + priceSecondHalf);
                        cinema.actualIncome += priceSecondHalf;
                    } else {
                        System.out.println("Ticket price: $" + priceFirstHalf);
                        cinema.actualIncome += priceFirstHalf;
                    }
                }
            }
            cinema.cinemaRoom[requestedRow - 1][requestedSeat - 1] = "B";
            menu(cinema);
        }
    }

    public static void statistics(MyCinema cinema) {

        int sumB = 0;
        int sumS = 0;
        for (String[] strings : cinema.cinemaRoom) {
            for (int j = 0; j < cinema.seats; j++) {
                if (strings[j].equals("B")) {
                    sumB++;
                } else {
                    sumS++;
                }
            }
        }

        System.out.println("Number of purchased tickets: " + sumB);
        System.out.printf("Percentage: %.2f", ((double) sumB / (double) (sumS + sumB) * 100));
        System.out.print("%\n");
        System.out.println("Current income: $" + cinema.actualIncome);
        System.out.println("Total income: $" + cinema.totalIncome);

        menu(cinema);
    }

    public static void fillCinemaWithSeats(MyCinema cinema) {

        for (int i = 0; i < cinema.rows; i++) {
            for (int j = 0; j < cinema.seats; j++) {
                cinema.cinemaRoom[i][j] = "S";
            }
        }

        if (cinema.rows * cinema.seats < 60) {
            cinema.totalIncome = cinema.rows * cinema.seats * 10;
        } else {
            int untilCheap = cinema.rows / 2;

            for (int i = 0; i < untilCheap; i++) {
                cinema.totalIncome += cinema.seats * 10;
            }
            for (int i = untilCheap; i < cinema.rows; i++) {
                cinema.totalIncome += cinema.seats * 8;
            }
        }

        menu(cinema);
    }

}