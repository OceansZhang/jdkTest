package com.study.designpattern.prototype;

/**
 * @ClassName PrototypeModel
 * @Description TODO
 * @Author zy
 * @Date 2020/6/1 下午2:35
 */
//原型模式：从原型实例复制克隆出新实例，绝不从类实例化。
// 强调一点，分为浅拷贝和深拷贝。浅拷贝只是拷贝地址，多个地址还是指向的一个对象。
public class PrototypeModel implements Cloneable{//实现克隆接口

    private int x;
    private int y = 0;

    //构造器
    public PrototypeModel(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void fly(){
        y++;
    }

    public void setX(int x) {
        this.x = x;
    }


    //重写克隆方法
    @Override
    protected PrototypeModel clone() throws CloneNotSupportedException {
        return (PrototypeModel) super.clone();
    }


}
