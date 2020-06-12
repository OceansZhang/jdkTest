package designpattern.abstractfactory;

/**
 * @ClassName MagicFactory
 * @Description TODO
 * @Author zy
 * @Date 2020/6/10 下午5:16
 */
public class MagicFactory extends AbstractFactory{
    @Override
    Food createFood() {
        return new Mushroom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new Magicwand();
    }
}
