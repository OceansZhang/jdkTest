package designpattern.adapter;

/**
 * @ClassName TV
 * @Description TODO
 * @Author zy
 * @Date 2020/6/1 下午3:36
 */
//适配器模式
    //电视两项插头，实现DualPin标准，
    //墙上的接口是三插标准，电视实现的是两插标准，无法通电。可以加个Adapter转换器来转换
public class TV implements DualPin{
    @Override
    public void electrify(int l, int n) {
        System.out.println("火线通电：" + l);
        System.out.println("零线通电：" + n);
    }
}
