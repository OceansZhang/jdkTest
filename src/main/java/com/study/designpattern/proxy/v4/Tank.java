package com.study.designpattern.proxy.v4;

import java.util.Random;

/**
 * @ClassName Tank
 * @Description TODO
 * @Author zy
 * @Date 2020/6/12 上午10:43
 */
//模拟测一个方法的性能，执行多久（不能改方法源码）
    //方法1：继承
    //方法2：聚合：代理模式：静态代理
//             代理有各种类型/代理对象改成Moveable
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

class TankTimeProxy implements Moveable {
    Moveable m;//聚合接口

    public TankTimeProxy(Moveable moveable) {
        this.m = moveable;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

class TankLogProxy implements Moveable {
    Moveable moveable;//聚合tank

    public TankLogProxy(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public void move() {
        System.out.println("tank start.....");
        moveable.move();
        long end = System.currentTimeMillis();
        System.out.println("tank end.....");
    }
}

class Mainlient{
    //嵌套
    public static void main(String[] args) {
        new TankTimeProxy(
            new TankLogProxy(
                new Tank())).move();
    }
}
