package designpattern.state;

/**
 * @ClassName Switcher
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 上午10:20
 */
//状态模式：对象的行为依赖于对象的状态变化(属性变更)，并且根据属性值(状态)的改变而改变相关的行为。
    //在我们的程序代码中包含和很多与对象状态有关的条件语句(如if……else……或者是switch等)的时候，就可以使用状态模式
    //将代码中的各种具体的状态抽象到一个类中。这样就有了状态类抽象对象。
//状态模式重点在各状态之间的切换从而做不同的事情，而策略模式更侧重于根据具体情况选择策略，并不涉及切换
    //状态模式不同状态下做的事情不同，而策略模式做的都是同一件事

public interface State {
    public void switchOn(Switcher switcher);//开
    public void switchOff(Switcher switcher);//关
}
