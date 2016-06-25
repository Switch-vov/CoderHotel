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
}
