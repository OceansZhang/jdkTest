package designpattern.decorate;

/**
 * @ClassName CardC
 * @Description TODO
 * @Author zy
 * @Date 2020/6/4 下午5:47
 */
public class CardC {
    BaseCard basec;
    String decription;
    public CardC(BaseCard basec)
    {
        this.basec = basec;
        decription = basec.decription;
    }
    public CardC()
    {

    }
    public  double cost()
    {
        if (basec != null)
        {
            return basec.cost();
        }
        else
        {
            return 0;
        }
    }
}
