package com.study.designpattern.proxy.v3;

import java.util.Random;

/**
 * @ClassName Tank
 * @Description TODO
 * @Author zy
 * @Date 2020/6/12 上午10:43
 */
//模拟测一个方法的性能，执行多久（不能改方法源码）
    //方法1：继承
    //方法2：聚合：代理模式/代理有各种类型
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

class TankTiimeProxy implements Moveable {
    Tank tank;//聚合tank

    public TankTiimeProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

class TankLogProxy implements Moveable{
    Tank tank;//聚合tank

    public TankLogProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        System.out.println("tank start.....");
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println("tank end.....");
    }
}

class Mainlient{
    public static void main(String[] args) {
        new TankTiimeProxy(new Tank()).move();
    }
}
