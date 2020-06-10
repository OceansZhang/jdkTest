import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyContainer2
 * @Description TODO
 * @Author zy
 * @Date 2020/5/29 上午10:36
 */
/*
 *添加 volatile 使t2能得到通知
 **/
public class MyContainer2 {
    volatile List  container = new ArrayList();

    public void add(Object o){
        container.add(o);
    }

    public int size(){
        return container.size();
    }

    public static void main(String[] args) {
        MyContainer2 myContainer2 = new MyContainer2();

        new Thread(() ->{
            for(int i=0;i<10;i++){
                myContainer2.add(new Object());
                System.out.println("thread t1 add "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t1").start();

        new Thread(() ->{
            while (true){
                if(myContainer2.size() == 5){
                    System.out.println("thread t2 end !!!");
                    break;
                }
            }
        },"t2").start();


    }
}
