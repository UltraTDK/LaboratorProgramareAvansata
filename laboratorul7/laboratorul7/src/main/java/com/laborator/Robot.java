package com.laborator;

import java.util.ArrayList;

public class Robot implements Runnable {
    private int id;
    private MatrixMap map;
    private ArrayList<Token> tokens;
    private boolean isPaused;
    private Object pauseLock;

    public Robot(int id, MatrixMap map) {
        this.id = id;
        this.map = map;
        this.tokens = new ArrayList<>();
        this.isPaused = false;
        this.pauseLock = new Object();
    }

    public void run() {
        while (!map.isExplored()) {
            if (!isPaused) {
                Position currentPos = map.getRobotPosition(id);
                System.out.println("Robotul se afla la pozitia:" + currentPos);
                Position nextPos = getNextPosition(currentPos);
                if (nextPos != null) {
                    map.moveRobot(id, currentPos, nextPos);
                    System.out.println("Robotul se muta la pozitia:" + nextPos);
                    Position unvisitedCell = map.getUnvisitedCell();
                    if (unvisitedCell != null) {
                        extractTokens(unvisitedCell);
                        map.markVisited(unvisitedCell);
                        System.out.println("Am extras tokeni de la pozitia" + unvisitedCell);
                    }
                }
            }
            else {
                synchronized (pauseLock) {
                    try {
                        pauseLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private Position getNextPosition(Position currentPos) {
        return currentPos;
    }

    private void extractTokens(Position cell) {
        for (int i = 0; i < map.getMapSize(); i++) {
            Token token = map.extractToken();
            if (token != null) {
                tokens.add(token);
            }
        }
    }

    public void pause() {
        isPaused = true;
    }

    public void resume() {
        isPaused = false;
        synchronized (pauseLock) {
            pauseLock.notifyAll();
        }
    }
}

