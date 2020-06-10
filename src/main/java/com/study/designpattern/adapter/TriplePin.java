package designpattern.adapter;

/**
 * @ClassName TriplePin
 * @Description TODO
 * @Author zy
 * @Date 2020/6/1 下午3:33
 */
//适配器模式
    //三线接口
public interface TriplePin {
    //参数分别为火线live，零线null，地线earth
    public void electrify(int l, int n, int e);
}
