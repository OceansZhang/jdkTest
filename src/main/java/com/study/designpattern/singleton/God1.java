package designpattern.singleton;

/**
 * @ClassName God
 * @Description TODO
 * @Author zy
 * @Date 2020/6/1 下午3:09
 */
//单例模式 "痴汉模式"：开始就创造了一个对象。如果没有人调用的话会占用空间
public class God1 {

    //private保证了私有性，不可见不可访问。
    //static保证了静态性，不依赖于类的实例化
    //final保证常量，不可回收。
    private static final God1 god1 = new God1();//自有永有的单实例
    private God1(){}//构造方法私有化，只有自己可以创造自己，其他不可以

    public static God1 getInstance(){//请实例方法公开化
        return god1;
    }


}
