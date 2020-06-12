package com.study.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @ClassName ArrayList
 * @Description TODO
 * @Author zy
 * @Date 2020/4/21 下午4:27
 */
public class ArrayListTest<S> {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //add()方法
        list.add("a1");
        list.add(1,"a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");

        list.remove(1);
        System.out.println(list);

        //System.arraycopy 方法
        String[] s1 = {"1","2","3"};
        String[] s2 = {"4","5","6"};

        System.arraycopy(s1,1,s2,2,1);
        for(int i=0;i<s2.length;i++){
            //System.out.println(s2[i]);
        }
        System.out.println(Math.round(-2.6));
        System.out.println(Math.round(2.6));


        //方法3
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            String host =  iterator.next();
            System.out.println(host);
        }
        //方法4
//        list.forEach(host->System.out.println(list));

        List<String> hostList = new ArrayList<String>(3);
        hostList.add("host1");
        hostList.add("host2");
        hostList.add("host3");
        //方法3
        //正常情况的迭代器是只能向后迭代，不能向前访问的。但是你可以通过这个ListItr迭代器实现向前访问
        for (ListIterator<String> iterator = hostList.listIterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
            System.out.println(iterator.next());
            System.out.println(iterator.previous());
            break;
        }



    }

}
