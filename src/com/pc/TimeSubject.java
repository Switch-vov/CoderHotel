package com.pc;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Switch on 2016-06-24.
 */
public abstract class TimeSubject {
    /**
     * 时钟绑定对象
     */
    protected Map<String, Clock> clocks = new HashMap<String, Clock>();

    /**
     * 附加城市和时钟
     * @param cityName 城市名
     * @param clock 时钟
     */
    public void attach(String cityName, Clock clock) {
        clocks.put(cityName, clock);
    }

    /**
     * 解除绑定
     * @param cityName 城市名
     */
    public void detach(String cityName) {
        clocks.remove(cityName);
    }

    /**
     * 提示所有时钟
     */
    public abstract void notifyAllClocks();
}
