package collection;

import java.util.HashMap;

/**
 * @ClassName HashMapTest
 * @Description TODO
 * @Author zy
 * @Date 2020/6/8 下午3:27
 */
//数据结构：1.7以前，数组+链表 1.8以后，数组+链表+红黑树
public class HashMapTest {

    public static void main(String[] args) {
        HashMap map = new HashMap();

        //1.	第一步调用了hash方法计算hash值
          //对key进行hashCode后，进行无符号右移16位和hashCode进行异或操作，用16位操作可以减少hash冲突，（散列碰撞）
        //2.	第二步计算容量和扩容
          //resize()方法，默认容量是16(1<<4),默认扩容因子0.75，扩容大小阀值是16*0.75=12
        //3.	第三步创建元素
        map.put(1,"test1");

        //解决冲突的方法：单链表+红黑树
        //解决hash冲突，单链法，会以单链表的形式，将冲突的节点挂在数组同样位置。这就是数据结构中说解决hash 的冲突方法之一：单链法。
        //JDK1.8对hash冲突的算法进行了优化。当链表节点数达到8个的时候，会自动转换为红黑树，自平衡的一种二叉树
        //红黑树的遍历效率是O(logn)肯定比单链表的O(n)要好很多。

    }
}
