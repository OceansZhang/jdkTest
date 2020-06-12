package com.study.designpattern.observer.v7;

import sun.misc.Launcher;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

/**
 * @ClassName TestFrame
 * @Description TODO
 * @Author zy
 * @Date 2020/6/11 下午3:13
 */
public class TestFrame extends Frame {
    public void launch(){
        Button button = new Button("press me");
        button.addActionListener(new MyActionListener());
        button.addActionListener(new MyActionListener1());
        this.add(button);
        this.pack();


        this.setVisible(true);
    }
}

class Main{
    public static void main(String[] args) {
        TestFrame frame = new TestFrame();
        frame.launch();
    }
}

class MyActionListener implements ActionListener{//Observer

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed......");
    }
}

class MyActionListener1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed1......");
    }
}
