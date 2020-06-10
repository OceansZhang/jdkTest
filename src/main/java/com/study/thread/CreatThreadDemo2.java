package com.study.thread;

/**
 * @ClassName CreatThreadDemo2
 * @Description TODO
 * @Author zy
 * @Date 2020/5/18 下午4:17
 */
public class CreatThreadDemo2 implements Runnable {
    //线程创建方法2：实现runnable接口，作为线任务存在
    //Runnable 只是来修饰线程所执行的任务，它不是一个线程对象。想要启动Runnable对象，必须将它放到一个线程对象里。

    public void run() {
        while (true){
            System.out.println("线程执行了!");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new CreatThreadDemo2());
        thread.start();
    }
}
