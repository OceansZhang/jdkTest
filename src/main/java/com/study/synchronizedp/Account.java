package com.study.synchronizedp;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Account
 * @Description TODO
 * @Author zy
 * @Date 2020/6/16 上午11:26
 */
//对业务写加锁，对读不加锁
//产生脏读问题
public class Account {
    String name;
    double balance;

    public synchronized void set(String name,double balance) {
        this.name = name;

        //模拟另一个线程来读
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance = balance;
    }

    public synchronized double getBalance(String name){
        return this.balance;
    }

    public static void main(String[] args) {
        Account account = new Account();
        new Thread(()-> account.set("zzhhaang",100.0)).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(account.getBalance("zzhhaang"));
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(account.getBalance("zzhhaang"));
    }

}
