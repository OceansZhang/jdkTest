package com.study.thread;

import sun.text.resources.cldr.ia.FormatData_ia;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName CreatThreadDemo6
 * @Description TODO
 * @Author zy
 * @Date 2020/5/18 下午4:39
 */
public class CreatThreadDemo6 {

    public static void main(String[] args) {
        //线程池创建
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        long threadpoolUseTime =  System.currentTimeMillis();
        for(int i = 0;i<10;i++){
            threadPool.execute(new Runnable() {

                public void run() {
                    System.out.println(Thread.currentThread().getName()+"线程执行了...");
                }
            });
        }
        long threadpoolUseTime1 = System.currentTimeMillis();
        System.out.println("多线程用时"+(threadpoolUseTime1-threadpoolUseTime));
        //销毁线程池
        threadPool.shutdown();
        threadpoolUseTime = System.currentTimeMillis();

    }



}
