package designpattern.singleton;

/**
 * @ClassName God4
 * @Description TODO
 * @Author zy
 * @Date 2020/6/1 下午3:22
 */
//单例模式：方法上的 synchronized 换到方法体内部,只有没实例的需要加锁等待创建
    //DCL
public class God4 {

    private volatile static God4 god4;

    private God4(){}

    public static God4 getInstance(){
        if(null == god4){
            synchronized (God4.class){
                god4 = new God4();
            }
        }
        return god4;
    }
}
