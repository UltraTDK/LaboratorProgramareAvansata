package org.example;

import java.util.Scanner;

public class PlayerStatus extends Player {
    private Scanner scanner;

    public PlayerStatus(String name, int playerNumber) {
        super(name, playerNumber);
        scanner = new Scanner(System.in);
    }

    @Override
    public Move getMove(Board board, long remainingTime) {
        System.out.println("Status curent:");
        System.out.println(board);

        System.out.println("Player-ul " + getName() + " (" + getPlayerNumber() + "), este randul tau. Mai ai " +
                remainingTime + " secunde ramase.");
        System.out.println("Alege o mutare (rand,coloana):");
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        int row = Integer.parseInt(parts[0].trim());
        int column = Integer.parseInt(parts[1].trim());
        return new Move(row, column, getPlayerNumber());
    }
}
