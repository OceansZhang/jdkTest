package com.study.synchronizedp;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyContainer3
 * @Description TODO
 * @Author zy
 * @Date 2020/5/29 上午10:45
 */
/*
 * 可以给list添加 volatile 来通知线程2，但是线程2死锁会浪费cpu，如果不用死循环呢？
 *  这里使用wait/notify（wait会释放锁，notify不会释放锁）
 *
 **/
public class MyContainer3 {

    volatile List c = new ArrayList<>();

    public void add(Object o){
        c.add(o);
    }

    public int size(){
        return c.size();
    }

    public static void main(String[] args) {
        MyContainer3 container3 = new MyContainer3();
        final Object lock = new Object();

        new Thread(()->{
            synchronized (lock){
                System.out.println("t2 start !");
                if(container3.size() != 5){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("t2 end !");
                lock.notify();
            }
        },"t2").start();

        new Thread(()->{
            synchronized (lock){
                for(int i=0;i<10;i++){
                    System.out.println("t1 add "+i);
                    container3.add(new Object());
                    if(container3.size() == 5){
                        lock.notify();//notify 通知t2，但是t1没有释放锁，所以t2还需等待t1执行完

                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        },"t1").start();


    }

}
