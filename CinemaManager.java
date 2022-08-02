package cinema;

import java.util.Scanner;
import java.util.Arrays;
public class Cinema {

    public static void printMap (int columns, char[][] map) {
        System.out.println("Cinema:");

        //Prints Column Index (Top Row)
        System.out.print("  ");
        for (int i = 0; i < columns; i++) {
            System.out.print(i + 1 + " ");
        }

        //Prints Map + Row index (Left Column)
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printTicketPrice(int rows, int seats, int rowChoice) {
        int sum = rows * seats;
        if (sum <= 60) {
            System.out.print("Ticket Price: $10");
        }
        else {
            if (rowChoice <= rows / 2) {
                System.out.println("Ticket Price is $10");
            }
            else if (rowChoice > rows / 2) {
                System.out.println("Ticket Price is $8");
            }
        }
    }

    public static void buyTicket(int rowNum, int seatNum, int rowCount, int seatCount, char[][] seats) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        do {
            try {
                System.out.println("Enter a row number:");
                rowNum = scanner.nextInt();
                System.out.println("Enter a seat number in that row:");
                seatNum = scanner.nextInt();

                if (seats[rowNum - 1][seatNum - 1] == 'B') {
                    System.out.println("That ticket has already been purchased!\n");
                    done = false;
                } else {
                    seats[rowNum - 1][seatNum - 1] = 'B';
                    printTicketPrice(rowCount, seatCount, rowNum);
                    System.out.println("\n");
                    done = true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong input!\n");
                done = false;
            }
        }
            while (!done);
    }

    public static boolean chooseOptions(int columns, int rowNum, int seatNum, int rowCount, int seatCount, char[][] map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        int userInput = scanner.nextInt();

        switch(userInput) {
            case 1:
                printMap(columns, map);
                return true;
            case 2:
                buyTicket(rowNum, seatNum, rowCount, seatCount, map);
                return true;
            case 3:
                int ticketCount = findTicketCount(map);
                double percentage = calculatePercentage(map);
                int currentIncome = calculateCurrentIncome(rowCount, seatCount, map);
                int totalIncome = calculateTotalIncome(rowCount, seatCount, map);
                printData(ticketCount, percentage, currentIncome, totalIncome);
                return true;
            case 0:
                break;
        }
        return false;
    }

    public static int findTicketCount (char[][] map) {
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'B') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void printData (int tickets, double percentage, int currentIncome, int totalIncome) {
        char c = '%';
        System.out.printf("Number of purchased tickets: %d\n", tickets);
        System.out.printf("Percentage: %.2f%c\n", percentage, c);
        System.out.printf("Current income: $%d\n", currentIncome);
        System.out.printf("Total income: $%d\n\n", totalIncome);
    }

    public static double calculatePercentage(char[][] map) {
        int occupiedCounter = 0;
        int emptyCounter = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'B') {
                    occupiedCounter++;
                }
                else if (map[i][j] == 'S') {
                    emptyCounter++;
                }
            }
        }
        double totalCounter = occupiedCounter + emptyCounter;
        double percentage = (occupiedCounter/ (totalCounter)) * 100;
        return percentage;
    }

    public static int calculateCurrentIncome(int rows, int seats, char[][] map) {
        int count = 0;
        int frontCount = 0;
        int backCount = 0;
        int total = rows * seats;

        if (total <= 60) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j] == 'B') {
                        count++;
                    }
                }
            }
            return count * 10;
        }
        else if (total > 60) {
            for (int i = 0; i < map.length / 2; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j] == 'B') {
                        frontCount++;
                    }
                }
            }
                for (int i = (map.length / 2); i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j] == 'B') {
                        backCount++;
                    }
                }
            }
            return (frontCount * 10) + (backCount * 8);
        }
        return count;
    }
    public static int calculateTotalIncome(int rows, int seats, char[][] map) {
        int count = 0;
        int frontCount = 0;
        int backCount = 0;
        int total = rows * seats;
        int halfTotal = total / 2;

        if (total <= 60) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j] == 'B' || map[i][j] == 'S') {
                        count++;
                    }
                }
            }
            return count * 10;
        }
        else if (total > 60) {
            for (int i = 0; i < map.length / 2; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j] == 'B' || map[i][j] == 'S') {
                        frontCount++;
                    }
                }
            }
            for (int i = (map.length / 2); i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j] == 'B' || map[i][j] == 'S') {
                        backCount++;
                    }
                }
            }
            return (frontCount * 10) + (backCount * 8);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount;
        int seatCount;
        int rowNumber = 0;
        int seatNumber = 0;
        boolean keepGoing = true;

        //Find Cinema Size
        System.out.println("Enter the number of rows:");
        rowCount = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        seatCount = scanner.nextInt();
        char[][] seats = new char[rowCount][seatCount];

        for (char[] c: seats) {
            Arrays.fill(c, 'S');
        }

        while (keepGoing) {
            keepGoing = chooseOptions(seatCount, rowNumber, seatNumber, rowCount, seatCount, seats);
        }
    }
}
