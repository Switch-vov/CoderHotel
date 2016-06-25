package com.pc.tdd;


/**
 * Created by Switch on 2016-06-25.
 */
public class PhoneClock extends Clock{

    private HotelWorldClockSystem hotelWorldClockSystem;
    private int time;

    public PhoneClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }

    public void setTime(int time) {
        this.time = time;
        if (this.hotelWorldClockSystem == null)
            return;
        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - super.utcOffset);
        }
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

    // TODO: PhoneClock.getTime() and CityClock.getTime() are duplicated
    @Override
    public int getTime() {
        return this.time;
    }
}
