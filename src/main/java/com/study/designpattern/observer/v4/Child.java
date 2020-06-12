package com.study.designpattern.observer.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Chile
 * @Description TODO
 * @Author zy
 * @Date 2020/6/11 上午10:52
 */
//加入多个观察者,耦合度高，不易对多种事件观察
public class Child {
    private boolean cry = false;
    List<Observer> observerList = new ArrayList<Observer>();
    {
        observerList.add(new Dad());
        observerList.add(new Mom());
        observerList.add(new Dog());
    }

    public boolean isCry(){
        return cry;
    }

    public void wakeUp(){
        System.out.println("child wakeUp.....");
        cry = true;
        for(Observer observer:observerList){
            observer.wakeUpAction();
        }
    }


}

class Dad implements Observer{
    public void wakeUpAction() {
        System.out.println("dad feed........");
    }
}

class Mom implements Observer{
    public void wakeUpAction() {
        System.out.println("mom hug........");
    }
}

class Dog implements Observer{
    public void wakeUpAction() {
        System.out.println("dog wang........");
    }
}

class Main{
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
