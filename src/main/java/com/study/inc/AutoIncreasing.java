package inc;

/**
 * @ClassName AutoIncreasing
 * @Description TODO
 * @Author zy
 * @Date 2020/5/29 上午11:27
 */
public class AutoIncreasing {
    public static void main(String[] args) {
        int i=1;
        i=i++;
        int j=i++;
        //int k=i+ ++i *i++;
        System.out.println(i);
        System.out.println(j);
        //System.out.println(k);
    }
}
