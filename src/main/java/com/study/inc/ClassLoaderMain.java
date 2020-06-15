package com.study.inc;

/**
 * @ClassName ClassLoaderMain
 * @Description TODO
 * @Author zy
 * @Date 2020/6/15 上午10:49
 */
public class ClassLoaderMain {

    public static void main(String[] args) {
        System.out.println(T.count);
    }
}
class T{
    //输出2，
    // 调用T时，先把classLoader内存进行verification验证，然后peration赋值默认值，T是null，count是0，
    //进行Initializing初始化，先调用new T(),count = 1,然后执行count = 2
    public static T t = new T();//null
    public static int count = 2;//0


    //输出3
//    public static int count = 2;//0
//    public static T t = new T();//null


    private T(){
        count++;
    }
}
