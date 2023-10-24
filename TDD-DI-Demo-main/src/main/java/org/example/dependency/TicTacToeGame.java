package org.example.dependency;

public class TicTacToeGame {
    private char[][] board;

    public TicTacToeGame() {
        board = new char[3][3];
    }

    public void setCell(int row, int col, char player) {
        board[row][col] = player;
    }

    public Character getCell(int row, int col) {
        return board[row][col];
    }

    public boolean checkWin(char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Check diagonals
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    public void reset() {
        board = new char[3][3];
    }

    public boolean draw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '\0') {
                    return false; // If any cell is empty, the game is not a draw
                }
            }
        }
        return true; // All cells are filled, and no player has won
    }
}
