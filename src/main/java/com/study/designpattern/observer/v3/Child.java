package com.study.designpattern.observer.v3;

/**
 * @ClassName Chile
 * @Description TODO
 * @Author zy
 * @Date 2020/6/11 上午10:52
 */
//加入多个观察者,耦合度高，不易对多种事件观察
public class Child {
    private boolean cry = false;
    private Dad dad;
    private Mom mom;
    private Dog dog;

    public boolean isCry(){
        return cry;
    }

    public void wakeUp(){
        System.out.println("child wakeUp.....");
        cry = true;
        mom.hug();
        dad.feed();
        dog.wang();
    }


}

class Dad{
    public void feed(){
        System.out.println("dad feed........");
    }
 }
class Mom{
    public void hug(){
        System.out.println("mom hug........");
    }
}
class Dog{
    public void wang(){
        System.out.println("dog wang........");
    }
}
class Main{
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
