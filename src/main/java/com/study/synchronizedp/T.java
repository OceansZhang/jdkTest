package com.study.synchronizedp;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName T
 * @Description TODO
 * @Author zy
 * @Date 2020/6/16 上午11:48
 */
//程序在执行过程中，如果出现异常，锁会被释放
    //所以在处理并发的过程中，要注意异常的处理，不然可能发生不一致的情况
    //第一个线程抛出异常，其他线程会进入同步代码块，有可能会访问到异常产生的数据
public class T {
    int count = 0;
    synchronized void m(){
        System.out.println(Thread.currentThread().getName()+" start");
        while (true){
            count++;
            System.out.println(Thread.currentThread().getName()+" count="+count);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count == 5){
                int i = 1/0;
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        T t = new T();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                t.m();
            }
        };
        Thread thread1 = new Thread(r);
        thread1.start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(r);
        thread2.start();
    }
}
