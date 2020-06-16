package com.study.concurrent.cas;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 解决同类型问题，使用AytomicXXX类
 * AytomicXXX类本身是原子性的，但是不能保证多个方法连续调用都是原子性的
 */
public class T01_AutomiicInteger {
    /**volatile**/ int count1 = 0;

    AtomicInteger count = new AtomicInteger(0);

    void m(){
        for(int i=0;i<10000;i++){
            count.incrementAndGet();//count1++
        }
    }

    public static void main(String[] args) {
        T01_AutomiicInteger t = new T01_AutomiicInteger();
        List<Thread> threadList = new ArrayList<>();
        for(int i=0;i<10;i++){
            threadList.add(new Thread(t::m,"thread-"+i));
        }
        threadList.forEach((o) -> o.start());
        threadList.forEach((o) -> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t.count);
    }
}
