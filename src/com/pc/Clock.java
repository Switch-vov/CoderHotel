package com.pc;

/**
 * Created by Switch on 2016-06-24.
 */
public abstract class Clock {
    /**
     * 相对于UTC时间的时间差
     */
    protected int UTC_OFFSET = 0;
    /**
     * 本地时间
     */
    protected int localTime = 0;

    public Clock(int utcOffset) {
        UTC_OFFSET = utcOffset;
    }

    /**
     * 设置本地时间
     * @param localTime 本地时间
     */
    public abstract void setLocalTime(int localTime);



    /**
     * 获取本地时间
     * @return 本地时间
     */
    public String getTime() {
        return String.valueOf(this.localTime);
    }

    /**
     * 通过UTC时间设置本地时间
     * @param utcZeroTime utc为零的时间
     */
    public void setLocalTimeFromUtcZeroTime(int utcZeroTime) {
        this.localTime = Clock.makeHourWithin0To23(utcZeroTime + this.UTC_OFFSET);
    }

    /**
     * 将时间限定在0-23之间
     * @param hour 小时数
     * @return 0-23的时间
     */
    private static int makeHourWithin0To23(int hour) {
        return (hour + 24) % 24;
    }
}
