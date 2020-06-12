package com.study.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName MainClient
 * @Description TODO
 * @Author zy
 * @Date 2020/6/1 下午2:48
 */
public class MainClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        List<PrototypeModel> pss = new ArrayList<PrototypeModel>();
        for(int i=0;i<50;i++){
            //每次new一个新对象，构造方法会调用50次，会造成cpu的极大浪费。
            //pss.add(new PrototypeModel(new Random().nextInt(200)));

            //克隆，浅拷贝
            pss.add(PrototypeModelFactory.getInstance(new Random().nextInt(200)));

        }
    }
}
