package com.laborator;

public class Main {
    public static void main(String[] args) {
        Exploration exploration = new Exploration(1, 3);
        exploration.startRobot();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        exploration.pauseRobot(1);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        exploration.resumeRobot(1);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
