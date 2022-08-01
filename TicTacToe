package tictactoe;

import java.util.Scanner;

public class Main {
    static boolean testXWins(char[] x, boolean xWins) {
        //Checks to see if X wins in top row
        if (x[0] == 'X' && x[1] == 'X' && x[2] == 'X') {
            xWins = true;
            //Checks to see if X wins in middle row
        } else if (x[3] == 'X' && x[4] == 'X' && x[5] == 'X') {
            xWins = true;
        }
        //Checks to see if X wins in bottom row
        else if (x[6] == 'X' && x[7] == 'X' && x[8] == 'X') {
            xWins = true;
        }
        //Checks to see if X wins in left column
        else if (x[0] == 'X' && x[3] == 'X' && x[6] == 'X') {
            xWins = true;
        }
        //Checks to see if X wins in middle column
        else if (x[1] == 'X' && x[4] == 'X' && x[7] == 'X') {
            xWins = true;
        }
        //Checks to see if X wins in right column
        else if (x[2] == 'X' && x[5] == 'X' && x[8] == 'X') {
            xWins = true;
        }
        //Checks to see if X wins in TL to BR diaganol
        else if (x[0] == 'X' && x[4] == 'X' && x[8] == 'X') {
            xWins = true;
        }
        //Checks to see if X wins in TR to BL diaganol
        else if (x[2] == 'X' && x[4] == 'X' && x[6] == 'X') {
            xWins = true;
        }
        return xWins;
    }
    static boolean testOWins(char[] x, boolean oWins) {
        //Checks to see if X wins in top row
        if (x[0] == 'O' && x[1] == 'O' && x[2] == 'O') {
            oWins = true;
            //Checks to see if X wins in middle row
        } else if (x[3] == 'O' && x[4] == 'O' && x[5] == 'O') {
            oWins = true;
        }
        //Checks to see if X wins in bottom row
        else if (x[6] == 'O' && x[7] == 'O' && x[8] == 'O') {
            oWins = true;
        }
        //Checks to see if X wins in left column
        else if (x[0] == 'O' && x[3] == 'O' && x[6] == 'O') {
            oWins = true;
        }
        //Checks to see if X wins in middle column
        else if (x[1] == 'O' && x[4] == 'O' && x[7] == 'O') {
            oWins = true;
        }
        //Checks to see if X wins in right column
        else if (x[2] == 'O' && x[5] == 'O' && x[8] == 'O') {
            oWins = true;
        }
        //Checks to see if X wins in TL to BR diaganol
        else if (x[0] == 'O' && x[4] == 'O' && x[8] == 'O') {
            oWins = true;
        }
        //Checks to see if X wins in TR to BL diaganol
        else if (x[2] == 'O' && x[4] == 'O' && x[6] == 'O') {
            oWins = true;
        }
        return oWins;
    }
    static void testDraw(char[] gb, boolean x, boolean y) {
        boolean containsSpace = false;
        for (char c : gb) {
            if (c == ' ') {
                containsSpace = true;
            }
        }
        if (x == false && y == false && containsSpace == false) {
            printGameBoard(gb);
            System.out.println("Draw");
        }
    }
    static void printXOWin(char[] gb, boolean x, boolean y) {
        if (x == true && y == false) {
            printGameBoard(gb);
            System.out.println("X wins");
        }
        else if (y == true && x == false) {
            printGameBoard(gb);
            System.out.println("O wins");
        }
    }
    static boolean isCellOccupied(char[] x, int coords) {

        if (coords == 11) {
            if (x[0] == 'X' || x[0] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                return true;
            }
        }
        else if (coords == 12) {
            if (x[1] == 'X' || x[1] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                return true;
            }
        }
        else if (coords == 13) {
            if (x[2] == 'X' || x[2] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                return true;
            }
        }
        else if (coords == 21) {
            if (x[3] == 'X' || x[3] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                return true;
            }
        }
        else if (coords == 22) {
            if (x[4] == 'X' || x[4] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                return true;
            }
        }
        else if (coords == 23) {
            if (x[5] == 'X' || x[5] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                return true;
            }
        }
        else if (coords == 31) {
            if (x[6] == 'X' || x[6] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                return true;
            }
        }
        else if (coords == 32) {
            if (x[7] == 'X' || x[7] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                return true;
            }
        }
        else if (coords == 33) {
            if (x[8] == 'X' || x[8] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                return true;
            }
        }
        else if (coords != 11 && coords != 12 && coords != 13 && coords != 21 && coords != 22 && coords != 23 && coords != 31 && coords != 32 && coords != 33){
            System.out.println("Coordinates should be from 1 to 3!");
            return true;
        }
        else {
            return false;
        }
        return false;
    }

    static boolean checkDigits (String userInput){
        try {
            int i = Integer.parseInt(userInput);
        } catch (Exception e) {
            System.out.println("You should enter numbers!");
            return false;
        }
        return true;
    }

    static int updateGame(char[] x, int coords) {
        if (coords == 11 && x[0] == ' ') {
            return 0;
        }
        else if (coords == 12 && x[1] == ' ') {
            return 1;
        }
        else if (coords == 13 && x[2] == ' ') {
            return 2;
        }
        else if (coords == 21 && x[3] == ' ') {
            return 3;
        }
        else if (coords == 22 && x[4] == ' ') {
            return 4;
        }
        else if (coords == 23 && x[5] == ' ') {
            return 5;
        }
        else if (coords == 31 && x[6] == ' ') {
            return 6;
        }
        else if (coords == 32 && x[7] == ' ') {
            return 7;
        }
        else if (coords == 33 && x[8] == ' ') {
            return 8;
        }
        return 10;
    }

    static void printGameBoard(char[] gb) {
        System.out.println("---------");
        System.out.println("| " + gb[0] + " " + gb[1] + " " + gb[2] + " |");
        System.out.println("| " + gb[3] + " " + gb[4] + " " + gb[5] + " |");
        System.out.println("| " + gb[6] + " " + gb[7] + " " + gb[8] + " |");
        System.out.println("---------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coordinates = null;
        int intCoords = 0;
        boolean xWins = false;
        boolean oWins = false;
        boolean needInput = true;
        char[] gameBoard = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        boolean playerXTurn = true;
        boolean gameNotOver = false;

        //Start the game
        while (gameNotOver == false){
            while (playerXTurn == true){
                printGameBoard(gameBoard);
                while (needInput = true) {
                    boolean isInt = false;
                    System.out.println("Enter coordinates");
                    String input = scanner.nextLine();
                    coordinates = input.replaceFirst(" ", "");
                    isInt = checkDigits(coordinates);
                    if (isInt == true) {
                        intCoords = Integer.parseInt(coordinates);
                        needInput = isCellOccupied(gameBoard, intCoords);
                        //System.out.println("NeedInput variable is " + needInput);
                    }
                    if (needInput == false) {
                        break;
                    }
                }
                int index = updateGame(gameBoard, intCoords);
                gameBoard[index] = 'X';
                playerXTurn = false;
                break;
            }

            xWins = testXWins(gameBoard, xWins);
            oWins = testOWins(gameBoard, oWins);
            if (xWins == true || oWins == true){
                testDraw(gameBoard, xWins, oWins);
                printXOWin(gameBoard, xWins, oWins);
                break;
            }


            //Player O's Turn
            while (playerXTurn == false){
                printGameBoard(gameBoard);
                while (needInput = true) {
                    boolean isInt = false;
                    System.out.println("Enter coordinates");
                    String input = scanner.nextLine();
                    coordinates = input.replaceFirst(" ", "");
                    isInt = checkDigits(coordinates);
                    if (isInt == true) {
                        intCoords = Integer.parseInt(coordinates);
                        needInput = isCellOccupied(gameBoard, intCoords);
                        //System.out.println("NeedInput variable is " + needInput);
                    }
                    if (needInput == false) {
                        break;
                    }
                }
                int index = updateGame(gameBoard, intCoords);
                gameBoard[index] = 'O';
                playerXTurn = true;
            }
            //Test if game is over
            xWins = testXWins(gameBoard, xWins);
            oWins = testOWins(gameBoard, oWins);
            if (xWins == true || oWins == true){
                testDraw(gameBoard, xWins, oWins);
                printXOWin(gameBoard, xWins, oWins);
                break;
            }
        }

    }
}
