package designpattern.strategy.demo1;

/**
 * @ClassName Addition
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 上午10:10
 */
//实现加法策略
public class Addition implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a + b;//这里我们做加法运算
    }
}
