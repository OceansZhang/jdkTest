package com.study.designpattern.observer.v2;

/**
 * @ClassName Chile
 * @Description TODO
 * @Author zy
 * @Date 2020/6/11 上午10:52
 */
//加入观察者,放入被观察者里，只要发生变动则做处理
public class Child {
    private boolean cry = false;
    private Dad dad;

    public boolean isCry(){
        return cry;
    }

    public void wakeUp(){
        System.out.println("child wakeUp.....");
        cry = true;
        dad.feed();
    }


}
class Dad{
    public void feed(){
        System.out.println("dad feed........");
    }
 }

class Main{
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
