package com.pc;

/**
 * Created by Switch on 2016-06-24.
 */
public class PhoneClock extends Clock{

    @Override
    public void setLocalTime(int localTime) {
        this.localTime = localTime;
        this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }
}
