public class Board {
    char[][] board;

    public Board() {
        board = new char[3][3];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isValidMove(int x, int y) {
        if (x >= 0 && x < 3 && y >= 0 && y < 3) {
            return board[x][y] == '-';
        }
        return false;
    }

    public void makeMove(int x, int y, char symbol) {
        board[x][y] = symbol;
    }

    public char getCell(int x, int y) {
        return board[x][y];
    }
}