package org.example;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private int currPlayerIndex;
    private int timeControl;
    private long startTime;

    public Game(Board board, List<Player> players, int timeControl) {
        this.board = board;
        this.players = players;
        this.currPlayerIndex = 0;
        this.timeControl = timeControl;
        this.startTime = System.currentTimeMillis();
    }

    public Result play() throws InterruptedException {
        while (!board.isGameOver()) {
            Player currentPlayer = players.get(currPlayerIndex);
            long remainingTime = timeControl - (System.currentTimeMillis() - startTime) / 1000;
            if (remainingTime <= 0) {
                System.out.println("Player-ul " + currentPlayer.getName() + " a ramas fara timp. Game over.");
                break;
            }

            currPlayerIndex = (currPlayerIndex + 1) % players.size();
        }

        System.out.println("Game over. Rezultate: " + board.getResult());

        return board.getResult();
    }
}

