import java.util.Scanner;

public class Main {
    Board board;
    Player player1;
    Player player2;
    Scanner scanner;
    CheckWin checkWin;

    public Main() {
        board = new Board();
        scanner = new Scanner(System.in);
        player1 = new Player("Player 1 (O)", 'O');
        player2 = new Player("Player 2 (X)", 'X');
        checkWin = new CheckWin();
    }

    public void playGame() {
        boolean gameWon = false;
        Player currentPlayer = player1;
        int moves = 0;

        while (!gameWon && moves < 9) {
            board.printBoard();
            System.out.println(currentPlayer.name + "'s turn (row column): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (board.isValidMove(x, y)) {
                board.makeMove(x, y, currentPlayer.symbol);
                moves++;

                if (checkWin.isWinner(board, currentPlayer.symbol)) {
                    board.printBoard();
                    System.out.println(currentPlayer.name + " wins!");
                    return;
                }

                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }

        board.printBoard();
        System.out.println("It's a draw!");
    }

    public static void main(String[] args) {
        Main game = new Main();
        game.playGame();
    }
}