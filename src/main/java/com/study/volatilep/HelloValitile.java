package com.study.volatilep;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName HelloValitile
 * @Description TODO
 * @Author zy
 * @Date 2020/6/16 下午4:59
 */
//volatile关键字，使一个变量在多个线程间可见，
    //使用volatile关键字，会让所有线程都读到变量的值
    //如下代码，v 是存在于堆内存的对象中，当线程1开始运行的时候，会把v的值从内存读到线程1的工作区，运行过程中直接使用这个copy，不会每次都去读堆内存
    //当另一个线程改了v的值后，线程1不会感知到
    //使用volatile，会强制所有线程从堆内存中获取v
public class HelloValitile {
    volatile boolean v = true;
    public void m(){
        while (v){

        }
        System.out.println("end-----");
    }

    public static void main(String[] args) {
        HelloValitile helloValitile = new HelloValitile();
        Thread thread = new Thread() {
            @Override
            public void run() {
                helloValitile.m();
            }
        };
        thread.start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        helloValitile.v = false;
    }
}
