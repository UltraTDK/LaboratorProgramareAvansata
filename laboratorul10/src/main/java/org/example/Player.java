package org.example;

public abstract class Player {
    private String name;
    private int playerNumber;

    public Player(String name, int playerNumber) {
        this.name = name;
        this.playerNumber = playerNumber;
    }

    public String getName() {
        return name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public abstract Move getMove(Board board, long remainingTime);
}
