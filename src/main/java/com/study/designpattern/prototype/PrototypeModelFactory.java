package com.study.designpattern.prototype;

/**
 * @ClassName PrototypeModelFactory
 * @Description TODO
 * @Author zy
 * @Date 2020/6/1 下午2:49
 */
public class PrototypeModelFactory {

    //此处用痴汉模式造一个
    private static PrototypeModel prototypeModel = new PrototypeModel(200);

    public static PrototypeModel getInstance(int x) throws CloneNotSupportedException {
       PrototypeModel model =  prototypeModel.clone();//复制
       model.setX(x);//重新设置x
       return model;
    }
}
