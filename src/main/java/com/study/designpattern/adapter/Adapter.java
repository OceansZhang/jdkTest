package designpattern.adapter;

/**
 * @ClassName Adapter
 * @Description TODO
 * @Author zy
 * @Date 2020/6/1 下午3:38
 */
public class Adapter implements TriplePin{

    private DualPin dualPinDevice;

    //创建转换器需要把两项插孔接口接进来
    public Adapter (DualPin dualPin){
        this.dualPinDevice = dualPin;
    }

    @Override
    public void electrify(int l, int n, int e) {
        //实际调用两项插孔接口的方法
        dualPinDevice.electrify(l,n);
    }
}
