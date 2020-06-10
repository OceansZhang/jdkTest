package designpattern.decorate;

/**
 * @ClassName CardA
 * @Description TODO
 * @Author zy
 * @Date 2020/6/4 下午5:33
 */
public class CardA {
    BaseCard basec;
    public String decription;

    public CardA(BaseCard basec)
    {
        this.basec = basec;
        decription = "cardA," + basec.decription;
    }
    public double cost()
    {
        return 50.00 + basec.cost();
    }
}
