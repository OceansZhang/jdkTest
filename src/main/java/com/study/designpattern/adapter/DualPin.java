package designpattern.adapter;

/**
 * @ClassName DualPin
 * @Description TODO
 * @Author zy
 * @Date 2020/6/1 下午3:34
 */
//适配器模式
    //两项插孔接口
public interface DualPin {
    public void electrify(int l, int n);//这里没有地线
}
