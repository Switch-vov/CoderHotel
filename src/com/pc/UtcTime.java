package com.pc;

/**
 * Created by Administrator on 2016-06-24.
 */
public class UtcTime extends TimeSubject{

    /**
     * utc为零的时间
     */
    private int utcZeroTime;

    public int getUtcZeroTime() {
        return utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }

    @Override
    public void notifyAllClocks() {
        for(Clock clock : super.clocks.values()) {
            clock.setLocalTime(Clock.toLocalTime(this.utcZeroTime));
        }
    }
}
