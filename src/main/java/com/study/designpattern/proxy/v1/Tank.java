package com.study.designpattern.proxy.v1;

import java.util.Random;

/**
 * @ClassName Tank
 * @Description TODO
 * @Author zy
 * @Date 2020/6/12 上午10:43
 */
public class Tank implements Moveable{
    //模拟坦克移动
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("Tank moving claclalcla......");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

interface Moveable{
    void move();
}

class Mainlient{
    public static void main(String[] args) {
        new Tank().move();
    }
}
