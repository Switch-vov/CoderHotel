package com.pc.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Switch on 2016-06-25.
 */
public class HotelWorldClocksTest {

    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock londonClock = new CityClock(0);
        PhoneClock phoneClock = new PhoneClock(8);

        // Act
        phoneClock.setCityClock(londonClock);
        phoneClock.setTime(9);

        // Assert
        assertEquals(1, londonClock.getTime());
    }
    // TODO-working-on: Negative hour
    @Test
    public void the_time_of_clock_NewYork_should_be_20_after_the_phone_clock_is_set_to_9_Beijing_time() {
        // Arrange
        CityClock newYorkClock = new CityClock(-5);
        PhoneClock phoneClock = new PhoneClock(8);

        // Act
        phoneClock.setCityClock(newYorkClock);
        phoneClock.setTime(9);

        // Assert
        assertEquals(20, newYorkClock.getTime());
    }
}