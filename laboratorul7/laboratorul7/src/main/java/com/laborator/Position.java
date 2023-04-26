package com.laborator;

public class Position {
    public int x, y;

    public Position(int i, int j) {
        this.x = i;
        this.y = j;
    }

    @Override
    public String toString() {
        return "Position [x=" + x + ", y=" + y + "]";
    }
}
