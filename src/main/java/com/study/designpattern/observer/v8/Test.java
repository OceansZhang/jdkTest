package com.study.designpattern.observer.v8;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zy
 * @Date 2020/6/11 下午3:24
 */
public class Test {
    public static void main(String[] args) {
        Button button = new Button();
        button.pressed();
    }

}

class Button{
    List<ActionListener> actionListenerList = new ArrayList();
    {
        actionListenerList.add(new MyActionListener1());
        actionListenerList.add(new MyActionListener2());
    }
    public void pressed(){
        ActionEvent event = new ActionEvent(System.currentTimeMillis(),this);
        for(ActionListener actionListener:actionListenerList){
            actionListener.actionPerformed(event);
        }
    }
}

interface ActionListener{
    void actionPerformed(ActionEvent event);
}

class MyActionListener1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("press button1....");
    }
}

class MyActionListener2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("press button2....");
    }
}

class ActionEvent{
    long time;
    Object object;//事件源对象

    public ActionEvent(long time, Object object) {
        this.time = time;
        this.object = object;
    }
}

