package com.pc;

/**
 * Created by Switch on 2016-06-24.
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
        notifyAllClocks();
    }

    @Override
    public void notifyAllClocks() {
        for(Clock clock : super.clocks.values()) {
            clock.setLocalTime(Clock.toLocalTime(this.utcZeroTime));
        }
    }

    /**
     * 打印所有时钟的时间
     */
    public void printTimeOfAllClocks() {
        for (String clockName : super.clocks.keySet()) {
            System.out.println(clockName + ": " + super.clocks.get(clockName).getTime());
        }
    }
}
