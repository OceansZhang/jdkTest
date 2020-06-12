package designpattern.factorymethod;

/**
 * @ClassName MainClient
 * @Description TODO
 * @Author zy
 * @Date 2020/6/10 下午4:00
 */
public class MainClient {
    public static void main(String[] args) {
        Movable m = new  CarFactory().create();
        m.go();
    }


}
