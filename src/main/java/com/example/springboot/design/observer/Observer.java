package com.example.springboot.design.observer;

public interface Observer {
    //状态更新
    public void update(float temp,float humidity,float pressure);
}
