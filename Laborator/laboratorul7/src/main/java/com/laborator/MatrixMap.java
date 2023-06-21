package com.laborator;

import java.util.ArrayList;
import java.util.Collections;

public class MatrixMap {
    private int mapSize;
    private int[][] map;
    private ArrayList<Position> robotPositions;
    private ArrayList<Token> tokens;

    public MatrixMap(int mapSize) {
        this.mapSize = mapSize;
        this.map = new int[mapSize][mapSize];
        this.robotPositions = new ArrayList<>();
        this.tokens = new ArrayList<>();
        initializeMatrix();
    }

    private void initializeMatrix() {
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = -1;
            }
        }
        System.out.println("Harta a fost creata.");
    }

    public void initializeTokens() {
        for (int i = 1; i <= mapSize; i++) {
            tokens.add(new Token(i));
        }
        Collections.shuffle(tokens);
        System.out.println("Tonkenii au fost asezati pe Harta.");
    }

    public boolean isExplored() {
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (map[i][j] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public void addRobot(int id, Position position) {
        robotPositions.add(position);
        map[position.x][position.y] = id;
    }

    public Position getRobotPosition(int id) {
        return robotPositions.get(id);
    }

    public void moveRobot(int id, Position currentPos, Position nextPos) {
        map[currentPos.x][currentPos.y] = -1;
        map[nextPos.x][nextPos.y] = id;
        robotPositions.set(id, nextPos);
    }

    public Position getUnvisitedCell() {
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (map[i][j] == -1) {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    public void markVisited(Position cell) {
        map[cell.x][cell.y] = -2;
    }

    public Token extractToken() {
        if (tokens.isEmpty()) {
            return null;
        }
        return tokens.remove(0);
    }

    public int getMapSize() {
        return mapSize;
    }

}
