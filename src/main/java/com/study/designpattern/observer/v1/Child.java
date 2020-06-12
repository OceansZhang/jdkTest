package com.study.designpattern.observer.v1;

/**
 * @ClassName Child
 * @Description TODO
 * @Author zy
 * @Date 2020/6/11 上午10:48
 */
public class Child {
    private boolean cry = false;
    public boolean isCry(){
        return cry;
    }

    public void wakeUp(){
        System.out.println("child wakeUp-----");
        cry = true;
    }

    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing...");
        }
    }
}
