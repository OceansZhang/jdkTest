package designpattern.abstractfactory;

/**
 * @ClassName ModernFactory
 * @Description TODO
 * @Author zy
 * @Date 2020/6/10 下午5:14
 */
public class ModernFactory extends AbstractFactory{
    @Override
    Food createFood() {
        return new Braed();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
