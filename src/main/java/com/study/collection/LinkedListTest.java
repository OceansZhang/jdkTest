package com.study.collection;

import java.util.LinkedList;

/**
 * @ClassName LinkedListTest
 * @Description TODO
 * @Author zy
 * @Date 2020/6/8 下午3:03
 */
//LinkedList底层是双向链表
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> hostList = new LinkedList<String>();
        hostList.add("host1");
        hostList.add("host2");
        hostList.add("host3");

        //二分法
        hostList.add(2,"host5");

        hostList.remove("host5");


    }
}
