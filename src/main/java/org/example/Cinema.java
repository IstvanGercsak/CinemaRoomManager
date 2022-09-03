package org.example;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int cinemaRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int cinemaSeats = scanner.nextInt();

        String[][] cinemaRoom = new String[cinemaRows][cinemaSeats];

        for (int i = 0; i < cinemaRoom.length; i++) {
            for (int j = 0; j < cinemaRoom[0].length; j++) {
                cinemaRoom[i][j] = "S";
            }
        }

        menu(cinemaRoom, scanner);

    }

    public static void menu(String[][] cinemaRoom, Scanner scanner) {

        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("0. Exit");

        switch (scanner.nextInt()) {
            case 0:
                break;
            case 1:
                printSeats(cinemaRoom, scanner);
                break;
            case 2:
                buyTicket(cinemaRoom.length, cinemaRoom[0].length, cinemaRoom, scanner);
                break;
            default:
                System.out.println("Wrong number!");
                menu(cinemaRoom, scanner);
        }
    }


    public static void printSeats(String[][] cinemaRoom, Scanner scanner) {

        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 0; i < cinemaRoom[0].length; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < cinemaRoom.length; i++) {
            System.out.print(i + 1 + "");
            for (int j = 0; j < cinemaRoom[0].length; j++) {
                System.out.print(" " + cinemaRoom[i][j]);
            }
            System.out.println();
        }

        menu(cinemaRoom, scanner);
    }


    public static void buyTicket(int cinemaRows, int cinemaSeats, String[][] cinemaRoom, Scanner scanner) {
        int price = 10;
        int priceFirstHalf = 10;
        int priceSecondHalf = 8;

        System.out.println("Enter a row number:");
        int requestedRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int requestedSeat = scanner.nextInt();

        if (cinemaRows * cinemaSeats < 60) {
            System.out.println("Ticket price: $" + price);
        } else if (cinemaRows * cinemaSeats > 60) {

            if (requestedRow > cinemaRows / 2) {
                System.out.println("Ticket price: $" + priceSecondHalf);
            } else {
                System.out.println("Ticket price: $" + priceFirstHalf);
            }

        }

        cinemaRoom[requestedRow - 1][requestedSeat - 1] = "B";

        menu(cinemaRoom, scanner);
    }

}