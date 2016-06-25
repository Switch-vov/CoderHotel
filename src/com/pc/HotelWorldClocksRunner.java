package com.pc;

/**
 * Created by Switch on 2016-06-25.
 */
public class HotelWorldClocksRunner {
    public static void main(String[] args) {
        // 初始化
        TimeSubject utcTime = new UtcTime();
        utcTime.attach("beijing", new CityClock(8));
        utcTime.attach("london", new CityClock(0));
        utcTime.attach("moscow", new CityClock(4));
        utcTime.attach("sydney", new CityClock(10));
        utcTime.attach("newYork", new CityClock(-5));

        Clock phoneClock = new PhoneClock(8);
        phoneClock.setUtcTime(utcTime);

        // 设置手机时间
        phoneClock.setLocalTime(9);

        // 打印所有时钟
        utcTime.printTimeOfAllClocks();

    }
}
