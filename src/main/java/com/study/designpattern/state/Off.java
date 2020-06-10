package designpattern.state;

/**
 * @ClassName Off
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 上午10:35
 */
public class Off implements State{
    @Override
    public void switchOn(Switcher switcher) {
        switcher.setState(new On());
        System.out.println("OK...灯亮");
    }

    @Override
    public void switchOff(Switcher switcher) {
        System.out.println("WARN!!!断电状态无需再关");
    }
}
