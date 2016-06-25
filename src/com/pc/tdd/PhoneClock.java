package com.pc.tdd;


/**
 * Created by Switch on 2016-06-25.
 */
public class PhoneClock {

    private CityClock cityClock;

    public PhoneClock(int utcOffset) {

    }

    public void setCityClock(CityClock cityClock) {
        this.cityClock = cityClock;
    }

    public void setTime(int time) {
        this.cityClock.setUtcZeroTime(time - this.utcOffset);
    }
}
