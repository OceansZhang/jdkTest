package com.study.designpattern.observer.v6;

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
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(),"bed",this);
        for(Observer observer:observerList){
            observer.wakeUpAction(event);
        }
    }


}

//事件类，根据不同的事件做出反应,一般事件需要知道被观察者是谁，因为每个观察者可以观察多个事件
//需要事件源对象
class WakeUpEvent{
    long time;
    String loc;
    Child source;
    public WakeUpEvent(long time, String loc,Child source) {
        this.time = time;
        this.loc = loc;
        this.source = source;
    }
}

class Dad implements Observer {
    public void wakeUpAction(
            WakeUpEvent event
    ) { 
        //不同处理
        if(event.loc == ""){

        }
        System.out.println("dad feed........");
    }
}

class Mom implements Observer {
    public void wakeUpAction(WakeUpEvent event) {
        System.out.println("mom hug........");
    }
}

class Dog implements Observer {
    public void wakeUpAction(WakeUpEvent event) {
        System.out.println("dog wang........");
    }
}

class Main{
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
