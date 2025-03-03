import java.util.*;

public class TicTacToe {
    private static final char[][] board = new char[3][3];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeBoard();
        playGame();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void playGame() {
        boolean gameWon = false;
        boolean player1Turn = true;
        int moves = 0;

        while (!gameWon && moves < 9) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            printBoard();
            System.out.println("Player " + (player1Turn ? "1 (O)" : "2 (X)") + " move: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (isValidMove(x, y)) {
                board[x][y] = player1Turn ? 'O' : 'X';
                gameWon = checkWin(player1Turn ? 'O' : 'X');
                if (gameWon) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    printBoard();
                    System.out.println("Player " + (player1Turn ? "1" : "2") + " wins!");
                }
                player1Turn = !player1Turn;
                moves++;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        if (!gameWon) {
            printBoard();
            System.out.println("It's a draw!");
        }
    }

    private static boolean isValidMove(int x, int y) {
        return x >= 0 && x < 3 && y >= 0 && y < 3 && board[x][y] == '-';
    }

    private static boolean checkWin(char symbol) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        else if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}