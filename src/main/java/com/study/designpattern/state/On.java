package designpattern.state;

/**
 * @ClassName On
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 上午10:34
 */
public class On implements State{
    @Override
    public void switchOn(Switcher switcher) {
        System.out.println("WARN!!!通电状态无需再开");
        return;
    }

    @Override
    public void switchOff(Switcher switcher) {
        switcher.setState(new Off());
        System.out.println("OK...灯灭");
    }
}
