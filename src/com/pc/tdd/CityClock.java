package com.pc.tdd;

/**
 * Created by Switch on 2016-06-25.
 */
public class CityClock {
    private int utcOffset;
    private int utcZeroTime;

    // TODO: The constructors of CityClock and PhoneClock are duplicated
    public CityClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public int getTime() {
        // TODO-working-on: The fake value in the production code and the expected value in the test code are duplicated
        return this.utcOffset + this.utcZeroTime;
    }
}
