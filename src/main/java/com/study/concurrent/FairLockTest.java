package com.study.concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ReentrantLockTest
 * @Description TODO
 * @Author zy
 * @Date 2020/6/8 下午5:24
 */
//公平锁
public class FairLockTest {

    private ReentrantLock lock = new ReentrantLock();

    //公平锁
      //定义：就是很公平，在并发环境中，每个线程在获取锁时会先查看此锁维护的等待队列，如果为空，或者当前线程线程是等待队列的第一个，就占有锁，否则就会加入到等待队列中，以后会按照FIFO的规则从队列中取到自己。
      //优点：所有的线程都能得到资源，不会饿死在队列中。
      //缺点：吞吐量会下降很多，队列里面除了第一个线程，其他的线程都会阻塞，cpu唤醒阻塞线程的开销会很大
    public void testFail(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"获得了锁");
        } finally {
            lock.unlock();
        }
    }

    //获得锁的顺序和线程启动顺序是一致的
    public static void main(String[] args) {
        FairLockTest fairLockTest = new FairLockTest();
        Runnable runnable = ()->{
            System.out.println(Thread.currentThread().getName()+"启动");
            fairLockTest.testFail();
        };
        Thread[] threads = new Thread[10];
        for(int i=0;i<10;i++){
            threads[i] = new Thread(runnable);
        }
        for (int i=0; i<10; i++) {
            threads[i].start();
        }
    }
}
