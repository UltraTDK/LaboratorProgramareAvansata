package com.laborator;

public class PauseTimer implements Runnable {
    private long duration;
    private Exploration exploration;
    private int robotId;

    public PauseTimer(long duration, Exploration exploration, int robotId) {
        this.duration = duration;
        this.exploration = exploration;
        this.robotId = robotId;
    }

    public void run() {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exploration.resumeRobot(robotId);
    }
}
