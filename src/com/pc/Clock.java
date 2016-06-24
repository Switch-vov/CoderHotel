package com.pc;

/**
 * Created by Switch on 2016-06-24.
 */
public abstract class Clock {
    /**
     * 相对于UTC时间的时间差
     */
    private final int UTC_OFFSET = 0;
    /**
     * 本地时间
     */
    private int localTime = 0;

    /**
     * 设置本地时间
     * @param localTime 本地时间
     */
    public abstract void setLocalTime(int localTime);
}
