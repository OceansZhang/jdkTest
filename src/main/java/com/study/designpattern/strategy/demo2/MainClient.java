package designpattern.strategy.demo2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName MainClient
 * @Description TODO
 * @Author zy
 * @Date 2020/6/9 下午5:01
 */
public class MainClient {

    public static void main(String[] args) {
        Cat[] arr = {new Cat(5,8),new Cat(3,5),new Cat(8,3)};
        //重量策略
        CatWeightCompare compare = new CatWeightCompare();
        Sort sort = new Sort();
        sort.sort(arr,compare);
        System.out.println(Arrays.toString(arr));

        //高度策略
        CatHeightCompare compare1 = new CatHeightCompare();
        sort.sort(arr,compare1);
        System.out.println(Arrays.toString(arr));

    }
}
