package com.study.designpattern.proxy.v2;

import java.util.Random;

/**
 * @ClassName Tank
 * @Description TODO
 * @Author zy
 * @Date 2020/6/12 上午10:43
 */
//模拟测一个方法的性能，执行多久（不能改方法源码）
    //方法：继承
public class Tank implements Moveable {
    //模拟坦克移动
    @Override
    public void move() {
        System.out.println("Tank moving claclalcla......");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

interface Moveable{
    void move();
}

class TankTest extends Tank{
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

class Mainlient{
    public static void main(String[] args) {
        new TankTest().move();
    }
}
