package com.laborator;

import java.util.ArrayList;
import com.laborator.Position;

public class Exploration {
    private ArrayList<Robot> robots;
    private MatrixMap map;

    public Exploration(int numRobots, int mapSize) {
        this.robots = new ArrayList<>();
        this.map = new MatrixMap(mapSize);
        initializeRobots(numRobots);
        map.initializeTokens();
    }

    private void initializeRobots(int numRobots) {
        for (int i = 0; i < numRobots; i++) {
            Robot robot = new Robot(i, map);
            robots.add(robot);
            map.addRobot(i, new Position(1, 1));
        }
    }

    public void startRobot() {
        for (Robot robot : robots) {
            Thread t = new Thread(robot);
            t.start();
            System.out.println("Un nou Robot a luat nastere " + t.getName());
        }
    }

    public void pauseRobot(int id) {
        robots.get(id).pause();
    }

    public void resumeRobot(int id) {
        robots.get(id).resume();
    }
}
