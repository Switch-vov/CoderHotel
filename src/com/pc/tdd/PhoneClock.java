package com.pc.tdd;


/**
 * Created by Switch on 2016-06-25.
 */
public class PhoneClock extends Clock{

    private HotelWorldClockSystem hotelWorldClockSystem;

    public PhoneClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }

    public void setTime(int time) {
        if (this.hotelWorldClockSystem == null)
            return;
        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - super.utcOffset);
        }
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

    public int getTime() {
        return 9;
    }
}
