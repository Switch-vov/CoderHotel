package com.pc.tdd;

/**
 * Created by Switch on 2016-06-25.
 */
public abstract class Clock {
    protected int utcOffset;
    public abstract int getTime();
}
