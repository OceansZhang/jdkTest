package designpattern.abstractfactory;

/**
 * @ClassName AbstractFactory
 * @Description TODO
 * @Author zy
 * @Date 2020/6/10 下午5:04
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();

}
