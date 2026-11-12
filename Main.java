import java.util.Scanner;
public class Main {
    void main() {

        Scanner in = new Scanner(System.in);
        String symbol = "";
        int turn = 0;
        int curPieces = 0;
        String[][] board = new String[6][7];
        int column = 0;
        boolean winner = false;

        System.out.println("Welcome to Connect Four!");
        String name1 = IO.readln("What is player 1 name ");
        String name2 = IO.readln("What is player 2 name ");
        IO.println("1 2 3 4 5 6 7");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ".";
            }

        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                IO.print(board[i][j]);
                if (j != board[0].length - 1) {
                    IO.print(" ");
                }
            }
            IO.println();

        }
        // 42 pieces in a board so if that many have been placed, the board is full
        while (curPieces != 42) {

            if (turn == 0) {
                symbol = "X";
                System.out.println(name1 + " (X) - Choose a column:");
                column = in.nextInt();
                
            } else {
                symbol = "O";
                System.out.println(name2 + " (O) - Choose a column:");
                column = in.nextInt();
                

            }
            for (int i = board.length - 1; i >= 0; i--) {
                if (board[i][column - 1].equals(".")) {
                    board[i][column - 1] = symbol;
                    break;
                }
            }
            curPieces++;
            IO.println("1 2 3 4 5 6 7");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    IO.print(board[i][j]);
                    if (j != board[0].length - 1) {
                        IO.print(" ");
                    }
                }
                IO.println();

            }

            turn = (turn + 1) % 2;

        }
    }
}
         
