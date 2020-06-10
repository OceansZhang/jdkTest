package com.study.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName CreatThreadDemo4
 * @Description TODO
 * @Author zy
 * @Date 2020/5/18 下午4:29
 */
public class CreatThreadDemo4 implements Callable{
    //创建带返回值的线程

    //重写Callable接口的call方法
    public Object call() throws Exception {
        int result = 1;
        System.out.println("线程逻辑计算中......");
        Thread.sleep(2000);
        return result;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CreatThreadDemo4 demo4 = new CreatThreadDemo4();
        //FutureTask最终实现的是runnable接口
        FutureTask<Integer> task = new FutureTask<Integer>(demo4);
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("我可以在这里做点别的业务逻辑...因为FutureTask是提前完成任务");
        Integer result = task.get();
        System.out.println("线程中运算的结果为:"+result);
    }

}
