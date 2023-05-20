package org.example;

public class Board {
    private int[][] board;
    private int size;
    private int cntMoves;
    private int winner;

    public Board(int size) {
        this.size = size;
        this.board = new int[size][size];
        this.cntMoves = 0;
        this.winner = 0;
    }

    public boolean isGameOver() {
        return winner != 0 || cntMoves == size * size;
    }

    public Result getResult() {
        if (winner == 1) {
            return Result.PLAYER_1_WINS;
        } else if (winner == 2) {
            return Result.PLAYER_2_WINS;
        } else {
            return Result.DRAW;
        }
    }
}

