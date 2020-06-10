package designpattern.strategy.demo2;

import java.util.Comparator;

/**
 * @ClassName CatHeightCompare
 * @Description TODO
 * @Author zy
 * @Date 2020/6/9 下午5:18
 */
//排序策略
public class CatHeightCompare implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.height < o2.height) return -1;
        else if(o1.height>o2.height) return 1;
        else return 0;
    }
}
