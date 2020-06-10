package com.study.thread;

/**
 * @ClassName CreateThreadDemo3
 * @Description TODO
 * @Author zy
 * @Date 2020/5/18 下午4:22
 */
public class CreateThreadDemo3 extends Thread{

    //匿名内部类创建线程对象


    public static void main(String[] args) {
        //创建无参线程对象
        new Thread(){
            @Override
            public void run() {
                System.out.println("线程执行了...");
            }
        }.start();

        //创建带线程任务的线程对象
        new Thread(new Runnable() {
            public void run() {
                System.out.println("线程执行了...");
            }
        }).start();


        //创建带线程任务并且重写run方法的线程对象
        new Thread(new Runnable() {
            public void run() {
                System.out.println("runnable run 线程执行了...");
            }
        }){
            @Override
            public void run() {
                System.out.println("override run 线程执行了...");
            }
        }.start();
    }
}
