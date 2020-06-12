package designpattern.abstractfactory;

/**
 * @ClassName MainClient
 * @Description TODO
 * @Author zy
 * @Date 2020/6/10 下午5:17
 */
//
public class MainClient {

    public static void main(String[] args) {
        AbstractFactory f = new ModernFactory();
        Food food = f.createFood();
        food.printName();
        Vehicle vehicle = f.createVehicle();
        vehicle.go();
        Weapon weapon = f.createWeapon();
        weapon.shoot();
    }
}
