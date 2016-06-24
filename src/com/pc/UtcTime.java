package com.pc;

/**
 * Created by Administrator on 2016-06-24.
 */
public class UtcTime extends TimeSubject{

    private int utcZeroTime;

    @Override
    public void notifyAllClocks() {
        for(Clock clock : super.clocks.values()) {
            clock.setLocalTime(Clock.toLocalTime(this.utcZeroTime));
        }
    }
}
