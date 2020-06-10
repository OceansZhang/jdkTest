package designpattern.strategy.demo1;

/**
 * @ClassName Calculator2
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 上午10:12
 */
//计算器类
public class Calculator2 {
    private Strategy strategy;//拥有某种算法策略

    //接入算法策略
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //返回具体策略的结果
    public int getResult(int a,int b){
        return strategy.calculate(a,b);
    }
}
