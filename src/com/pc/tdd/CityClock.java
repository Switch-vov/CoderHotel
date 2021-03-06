package com.pc.tdd;

/**
 * Created by Switch on 2016-06-25.
 */
public class CityClock extends Clock{
    private int utcZeroTime;

    // TODO: The constructors of CityClock and PhoneClock are duplicated
    public CityClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }

    public int getTime() {
        return (super.utcOffset + this.utcZeroTime + 24) % 24;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
