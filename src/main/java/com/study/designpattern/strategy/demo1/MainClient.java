package designpattern.strategy.demo1;

/**
 * @ClassName MainClient
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 上午10:14
 */

//新的算法是不需要再更改任何现有代码的，只需要新写一个算法比如乘法Multiplication，
// 并实现calculate方法，接下来要做的只是组装上去便可以使用了。
public class MainClient {

    public static void main(String[] args) {
        Calculator2 calculator2 = new Calculator2();//实例化计算器
        calculator2.setStrategy(new Addition());//接入加法实现
        System.out.println(calculator2.getResult(2,1));

        calculator2.setStrategy(new Subtraction());//接入减法实现
        System.out.println(calculator2.getResult(2,1));
    }
}
