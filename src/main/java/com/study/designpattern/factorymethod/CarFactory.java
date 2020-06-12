package designpattern.factorymethod;

/**
 * @ClassName CarFactory
 * @Description TODO
 * @Author zy
 * @Date 2020/6/10 下午4:00
 */
public class CarFactory {

    public Movable create(){
        return new Car();
    }
}
