package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initializare tabla
        Board board = new Board(5);

        // Initializare jucatori
        Player player1 = new PlayerStatus("Maria", 1);
        Player player2 = new PlayerStatus("Ion", 2);

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        // Initializare joc
        Game game = new Game(board, players, 5);

        // Start joc
        Result result = game.play();

        // Afisare rezultate
        System.out.println("Game over! Rezultate: " + result);
    }
}
