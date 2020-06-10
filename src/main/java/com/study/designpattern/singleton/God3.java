package designpattern.singleton;

/**
 * @ClassName God3
 * @Description TODO
 * @Author zy
 * @Date 2020/6/1 下午3:20
 */
//单例模式 多线程加锁，
    //开始就加锁，会造成cpu浪费
public class God3 {
    private God3 god3;
    private God3(){}

    public synchronized God3 getInstance() {
        if(null == god3){
            god3 = new God3();
        }
        return god3;
    }
}
