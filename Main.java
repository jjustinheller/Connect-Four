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
    }
}
         
