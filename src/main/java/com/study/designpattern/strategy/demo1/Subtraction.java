package designpattern.strategy.demo1;

/**
 * @ClassName Subtraction
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 上午10:11
 */
//实现减法策略
public class Subtraction implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
