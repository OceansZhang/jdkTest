package designpattern.strategy.demo2;

import java.util.Comparator;

/**
 * @ClassName CatWeightCompare
 * @Description TODO
 * @Author zy
 * @Date 2020/6/9 下午5:11
 */
//排序策略
public class CatWeightCompare implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.weight < o2.weight) return -1;
        else if(o1.weight>o2.weight) return 1;
        else return 0;
    }
}
