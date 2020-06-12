package designpattern.factorymethod;

/**
 * @ClassName SimpleVehicleFactory
 * @Description TODO
 * @Author zy
 * @Date 2020/6/10 下午3:58
 */
//简单工厂模式，扩展性不好
public class SimpleVehicleFactory {

    public Car createCar(){
        return new Car();
    }

    public Broom createBroom(){
        return new Broom();
    }


}
