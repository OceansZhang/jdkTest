package designpattern.state;

/**
 * @ClassName Switcher
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 上午10:36
 */
public class Switcher {
    //开关的初始状态设置为“关”
     private State state = new Off();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void swiitchOn(){
        state.switchOn(this);//这里调用的是当前状态的开方法
    }

    public void swiitchOff(){
        state.switchOn(this);//这里调用的是当前状态的关方法
    }
}
