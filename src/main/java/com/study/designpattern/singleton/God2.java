package designpattern.singleton;

/**
 * @ClassName God2
 * @Description TODO
 * @Author zy
 * @Date 2020/6/1 下午3:17
 */
//单例模式：懒汉模式：省了一段内存，但是第一次会想相较痴汉模式效率低
    //但是多线程会有问题
public class God2 {
    private static God2 god2;//开始不进行实例化

    private God2(){}

    public static God2 getInstance(){
        if(null == god2){
            god2 =  new God2();
        }
        return god2;
    }

}
