package com.study.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName Bullet
 * @Description TODO
 * @Author zy
 * @Date 2020/6/11 下午5:49
 */
//享元模式
public class Bullet {
    public UUID id = UUID.randomUUID();
    public boolean isalive;


}
//池化思想
//从池子里取，取不到的话再new一个
class BulletPool{

    List<Bullet> bullets = new ArrayList<>();
    {
        for(int i=0;i<5;i++){
            bullets.add(new Bullet());
        }
    }

    public Bullet getBullet(){
        for(Bullet bullet:bullets){
            if(bullet.isalive){
                return bullet;
            }
        }
        return new Bullet();
    }

}
