package com.example.robin.taggingpsd.Model;

public class Timer {
    int savedTime;
    int min;
    int sec;

    public Timer() {
        savedTime = (int) System.currentTimeMillis();
    }


    public String getTime(){
        min = (((int) System.currentTimeMillis() - savedTime) / 1000)/60;
        sec = (((int) System.currentTimeMillis() - savedTime) / 1000)%60;
        return String.format(min+":"+sec);
    }



}
