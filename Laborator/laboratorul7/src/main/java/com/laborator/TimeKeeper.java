package com.laborator;

public class TimeKeeper {
    private long startTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public long getTime() {
        return System.currentTimeMillis() - startTime;
    }
}
