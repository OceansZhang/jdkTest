package designpattern.factorymethod;

/**
 * @ClassName Car
 * @Description TODO
 * @Author zy
 * @Date 2020/6/10 下午3:42
 */
public class Car implements Movable {
    @Override
    public void go() {
        System.out.println("car go ------");
    }
}
