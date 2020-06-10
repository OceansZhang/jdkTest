package designpattern.strategy.demo1;

/**
 * @ClassName Calculator
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 上午10:06
 */
//计算器类
//违反设计模式原则：只有加法和减法。不易扩展
public class Calculator1 {
    public int add(int a, int b){//加法
        return a + b;
    }
    public int sub(int a, int b){//减法
        return a - b;
    }
}
