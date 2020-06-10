package concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName UnFairLockTest
 * @Description TODO
 * @Author zy
 * @Date 2020/6/8 下午5:35
 */
//非公平锁
public class UnFairLockTest {
    private ReentrantLock lock = new ReentrantLock(false);

    //定义：线程加锁时直接尝试获取锁，获取不到就自动到队尾等待。
    //优点：非公平锁性能高于公平锁性能，非公平锁能更充分的利用cpu的时间片，尽量的减少cpu空闲的状态时间。
    //缺点：可能导致队列中间的线程一直获取不到锁或者长时间获取不到锁，导致饿死。
    public void testUnFail(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"获得了锁");
        } finally {
            lock.unlock();
        }
    }

    //获得锁的顺序和线程启动顺序是一致的
    public static void main(String[] args) {
        UnFairLockTest unFairLockTest = new UnFairLockTest();
        Runnable runnable = ()->{
            System.out.println(Thread.currentThread().getName()+"启动");
            unFairLockTest.testUnFail();
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
