# Cinema Room Manager

## Description

This project is a good opportunity to work with input and output in Java. You will deal with multidimensional arrays and functions as well as loops and conditional statements.

Cinema has been a part of the entertainment industry for a long time: a good movie is a way to escape reality and live through a variety of emotions. The best cinema experience you can get is probably in a cinema theatre. In this project, you will create an application that helps manage a cinema theatre: sell tickets, check available seats, see sales statistics, and more.

Project difficulty: **Medium** from
- 1 - Easy - Easy projects if you're just starting
- **2 - Medium - Medium projects to build upon the basics**
- 3 - Hard - Hard projects to practice all the basic concepts and learn new ones
- 4 - Challenging - Challenging projects to perfect your knowledge with challenging tasks

[Project task link](https://hyperskill.org/projects/133?track=8)

## Implementation stages

### 1/5 - Visualize the seating arrangement by printing it to the console.

#### Description:
There are many enjoyable activities on this funny little planet Earth, and still, the happiest, simplest, and most fulfilling one is probably going to the movies. Going with friends, going with loved ones, experiencing a whole new adventure from the safety of a cinema seat, surrounded by like-minded fellow travelers.

As a beginner developer, you can contribute to creating this wonderful cinema experience. Your good friends asked you to help them create an application for a cinema theatre where people can get tickets, reserve seats, and enjoy their movie night.

#### Objectives:
There is not a lot of space in our new cinema theatre, so you need to take into account the restrictions on the number of seats. Your friends said that the room would fit 7 rows of 8 seats. Your task is to help them visualize the seating arrangement by printing the scheme to the console.

Your output should be like in the example below and should contain 9 lines.

### 2/5 - Calculate the profit from all the sold tickets.

#### Description:
Good job: our friends really liked your program! Now they want to expand their theater and add screen rooms with more seats. However, this is expensive, so they want to make sure this will pay off. Help them calculate the profit from all the sold tickets depending on the number of available seats.

#### Objectives:
In this stage, you need to read two positive integer numbers from the input: the number of rows and the number of seats in each row. The ticket price is determined by the following rules:
- If the total number of seats in the screen room is not more than 60, then the price of each ticket is 10 dollars.
- In a larger room, the tickets are 10 dollars for the front half of the rows and 8 dollars for the back half. Please note that the number of rows can be odd, for example, 9 rows. In this case, the first half is the first 4 rows, and the second half is the other 5 rows.

Calculate the profit from the sold tickets depending on the number of seats and print the result as shown in the examples below. After that, your program should stop. Note that in this project, the number of rows and seats won't be greater than 9.

- Calculate the profit from all the sold tickets.

### 3/5 - Set the ticket price.

#### Description:
When choosing a ticket you are guided not only by your space preference but also by your finances. Let's implement the opportunity to check the ticket price and see the reserved seat.

#### Objectives:
Read two positive integer numbers that represent the number of rows and seats in each row and print the seating arrangement like in the first stage. Then, read two integer numbers from the input: a row number and a seat number in that row. These numbers represent the coordinates of the seat according to which the program should print the ticket price. The ticket price is determined by the same rules as the previous stage:

- If the total number of seats in the screen room is not more than 60, then the price of each ticket is 10 dollars.
- In a larger room, the tickets are 10 dollars for the front half of the rows and 8 dollars for the back half. Please note that the number of rows can be odd, for example, 9 rows. In this case, the first half is the first 4 rows, and the second half is the last 5 rows.

After that, the program should print out all the seats in the screen room as shown in the example and mark the chosen seat by the B symbol. Finally, it should print the ticket price and stop. Note that in this project, the number of rows and seats won't be greater than 9.

### 4/5 - Add a menu that allows you to buy tickets and display the current state of the seating arrangement.

#### Description:
The theatre is getting popular, and the customers started complaining that it's not practical that the program stops after buying one ticket. Let's add a menu that will allow them to buy tickets and display the current state of the seating arrangement when needed.

#### Objectives:
At the start, your program should read two positive integer numbers that represent the number of rows and seats in each row. Then, it should print a menu with the following three items:

- Show the seats should print the current seating arrangement. The empty seats should be marked with an S symbol, and taken seats are marked with a B symbol.
- Buy a ticket should read the seat coordinates from the input and print the ticket price like in the previous stage. After that, the chosen seat should be marked with a B when the item Show the seats is called.
- Exit should stop the program.

### 5/5 - Handle some input errors.

#### Description:
Running a cinema theatre is no easy business. To help our friends, let's add statistics to your program. The stats will show the current income, total income, the number of available seats, and the percentage of occupancy.

In addition, our friends asked you to take care of a small inconvenience: it's not good when a user can buy a ticket that has already been purchased by another user. Let's fix this!

#### Objectives:
Now your menu should look like this:

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit

When the item Statistics is chosen, your program should print the following information:

- The number of purchased tickets;
- The number of purchased tickets represented as a percentage. Percentages should be rounded to 2 decimal places;
- Current income;
- The total income that shows how much money the theatre will get if all the tickets are sold.

The rest of the menu items should work the same way as before, except the item Buy a ticket shouldn't allow a user to buy a ticket that has already been purchased.

If a user chooses an already taken seat, print That ticket has already been purchased! and ask them to enter different seat coordinates until they pick an available seat. Of course, you shouldn't allow coordinates that are out of bounds. If this happens, print Wrong input! and ask to enter different seat coordinates until the user picks an available seat.

# Used technology
- Java
- IntelliJ IDEA