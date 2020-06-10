package com.study.thread;

import sun.applet.Main;

/**
 * @ClassName CreatThreadDemo1
 * @Description TODO
 * @Author zy
 * @Date 2020/5/18 下午4:07
 */
public class CreatThreadDemo1 extends Thread{
  //线程创建方法1：继承Thread类，作为线程对象存在

    public CreatThreadDemo1(String name) {
        super();
        System.out.println(name);
    }

    @Override
    public void run() {
        while (!interrupted()){
            System.out.println(getName()+"线程执行了!");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CreatThreadDemo1 demo1 = new CreatThreadDemo1("first");
        CreatThreadDemo1 demo2 = new CreatThreadDemo1("two");

        demo1.start();
        demo2.start();

        demo2.interrupt();
    }
}
