package com.pc;

/**
 * Created by Switch on 2016-06-24.
 */
public class CityClock extends Clock{

    public CityClock(int utcOffset) {
        super();
    }

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
    }
}
