package com.pc.tdd;

import java.util.ArrayList;

/**
 * Created by Switch on 2016-06-25.
 */
public class HotelWorldClockSystem {
    private ArrayList<CityClock> cityClocks = new ArrayList<>();

    public void attach(CityClock cityClock) {

    }

    public ArrayList<CityClock> getClocks() {
        return this.cityClocks;
    }
}
