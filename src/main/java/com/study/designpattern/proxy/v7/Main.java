package com.study.designpattern.proxy.v7;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * @ClassName Main
 * @Description TODO
 * @Author zy
 * @Date 2020/6/15 下午4:08
 */
//cglib动态代理不需要接口
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank tank = (Tank)enhancer.create();
        tank.move();

    }

}

class TimeMethodInterceptor implements MethodInterceptor{

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass().getName());
        System.out.println(o.getClass().getSuperclass().getName());
        System.out.println("before....");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("after....");
        return result;
    }
}

class Tank{
    public void move(){
        System.out.println("Tank moving claclalcla......");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}