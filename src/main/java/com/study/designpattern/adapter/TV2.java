package designpattern.adapter;

/**
 * @ClassName TV2
 * @Description TODO
 * @Author zy
 * @Date 2020/6/1 下午3:41
 */
public class TV2 extends Adapter {
    public TV2(DualPin dualPin) {
        super(dualPin);
    }

    public void electrify(int l, int n) {
        System.out.println("火线通电：" + l);
        System.out.println("零线通电：" + n);
    }
}
