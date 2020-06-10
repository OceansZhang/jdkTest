package designpattern.strategy.demo1;

/**
 * @ClassName Strategy
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 上午10:09
 */
//把实现细节抽取出来，独立为n个策略，实现同一个接口
public interface Strategy {
    public int calculate(int a, int b);//操作数，被操作数
}
