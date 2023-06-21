package org.example;

public class Move {
    private int row;
    private int column;
    private int player;

    public Move(int row, int column, int player) {
        this.row = row;
        this.column = column;
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "(" + row + "," + column + ")";
    }
}
