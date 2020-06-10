package com.study.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName CreatThreadDemo5
 * @Description TODO
 * @Author zy
 * @Date 2020/5/18 下午4:35
 */
public class CreatThreadDemo5 {
    //定时器Timer

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时器线程执行了...");
            }
        },1000,10000);
    }
}
