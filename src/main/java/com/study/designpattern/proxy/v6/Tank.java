package com.study.designpattern.proxy.v6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
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
    //v5:如果代理类TankLogProxy重用，可以代理任何类型，（分离代理行为和被代理对象，使用jdk动态代理）
    //jdk动态代理：jdk反射必须面向接口
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


class Mainlient{
    //嵌套
    public static void main(String[] args) {
        Tank tank = new Tank();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Moveable m = (Moveable) Proxy.newProxyInstance(Tank.class.getClassLoader(),new Class[]{Moveable.class},new MyProxyHandler(tank));
       m.move();
    }
}

class MyProxyHandler implements InvocationHandler{
    Tank tank;

    public MyProxyHandler(Tank tank) {
        this.tank = tank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("tank start...."+method.getName());
        Object o = method.invoke(tank,args);//tank.move()
        System.out.println("tank end...."+method.getName());
        return  o;
    }
}
