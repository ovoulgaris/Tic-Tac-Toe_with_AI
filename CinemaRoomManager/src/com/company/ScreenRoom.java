package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ScreenRoom {
    final int rows;
    final int seatsPerRow;
    int totalIncome;
    int totalSize;
    int frontRows;
    Scanner scanner = new Scanner(System.in);
    ArrayList<ArrayList<Seat>> seats = new ArrayList<>();

    public ScreenRoom(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
        this.totalSize = rows * seatsPerRow;
        this.frontRows = rows;
        if (this.totalSize > 60) {
            this.frontRows = rows / 2;
        }
        this.totalIncome = ((frontRows * 10) + ((rows - frontRows) * 8)) * seatsPerRow;
        createSeats();
    }

    public void displayMenu() {
        System.out.println("\n1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "3. Statistics\n" +
                "0. Exit");
        int menuChoice = scanner.nextInt();

        switch (menuChoice) {
            case 1:
                printScreenRoom();
                displayMenu();
                break;
            case 2:
                buyTicket();
                displayMenu();
                break;
            case 3:
                System.out.println("\nNumber of purchased tickets: " + purchasedTickets());
                System.out.printf("Percentage: %.2f%%\n", findPercentage());
                System.out.println("Current income: $" + currentIncome());
                System.out.println("Total income: $" + totalIncome);
                displayMenu();
                break;
            default:
                break;
        }
    }

    private void printScreenRoom() {
        System.out.println("\nCinema:");
        System.out.print(" ");
        for (int i = 0; i < this.seatsPerRow; i++) {
            System.out.print(" " + (i + 1));
        }
        for (ArrayList<Seat> row : seats) {
            System.out.print("\n" + (seats.indexOf(row) + 1));
            for (Seat seat : row) {
                if (seat.isSeatOccupied()) {
                    System.out.print(" B");
                } else System.out.print(" S");
            }
        }
        System.out.print("\n");
    }

    public void buyTicket() {
        System.out.println("\nEnter a row number:");
        int buyerNoOfRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int buyerNoOfSeat = scanner.nextInt();
        if (buyerNoOfRow > rows || buyerNoOfSeat > seatsPerRow || buyerNoOfRow <= 0 || buyerNoOfSeat <= 0) {
            System.out.println("Wrong input!");
            buyTicket();
        } else if (seats.get(buyerNoOfRow - 1).get(buyerNoOfSeat - 1).isSeatOccupied()) {
            System.out.println("\nThat ticket has already been purchased!");
            buyTicket();
        } else {
            int price = seats.get(buyerNoOfRow - 1).get(buyerNoOfSeat - 1).getPrice();
            seats.get(buyerNoOfRow - 1).get(buyerNoOfSeat - 1).bookSeat();
            System.out.println("\nTicket price: $" + price);
        }
    }

    private int purchasedTickets() {
        int sumOfTickets = 0;
        for (ArrayList<Seat> row : seats) {
            for (Seat seat : row) {
                if (seat.isSeatOccupied()) {
                    sumOfTickets++;
                }
            }
        }
        return sumOfTickets;
    }

    private int currentIncome() {
        int sumOfSales = 0;
        for (ArrayList<Seat> row : seats) {
            for (Seat seat : row) {
                if (seat.isSeatOccupied()) {
                    sumOfSales += seat.getPrice();
                }
            }
        }
        return sumOfSales;
    }

    private double findPercentage() {
        return ((double) purchasedTickets() / totalSize) * 100;
    }

    private void createSeats() {
        for (int i = 0; i < this.rows; i++) {
            seats.add(new ArrayList<>());
            int rowPrice = (i + 1 > this.frontRows) ? 8 : 10;
            for (int j = 0; j < seatsPerRow; j++) {
                seats.get(i).add(new Seat(rowPrice));
            }
        }
    }
}
