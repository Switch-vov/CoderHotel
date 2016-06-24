package com.pc;

/**
 * Created by Switch on 2016-06-24.
 */
public abstract class Clock {
    /**
     * 相对于UTC时间的时间差
     */
    private static final int UTC_OFFSET = 0;
    /**
     * 本地时间
     */
    private int localTime = 0;

    /**
     * 设置本地时间
     * @param localTime 本地时间
     */
    public abstract void setLocalTime(int localTime);

    /**
     * 从UTC时间到本地时间
     * @param utcZeroTime utc为零的时间
     * @return 本地时间
     */
    public static int toLocalTime(int utcZeroTime) {
        return utcZeroTime + UTC_OFFSET;
    }
}
