package designpattern.decorate;

/**
 * @ClassName CardB
 * @Description TODO
 * @Author zy
 * @Date 2020/6/4 下午5:34
 */
public class CardB {
    BaseCard basec;
    String decription;
    public CardB(BaseCard basec)
    {
        this.basec = basec;
        decription = "couponsA," + basec.decription;
    }
    public  double cost()
    {
        return 40.00 + basec.cost();
    }

}
