import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyContainer1
 * @Description TODO
 * @Author zy
 * @Date 2020/5/29 上午10:13
 */
/*
 * list不可见，不能结束。
 **/
public class MyContainer1 {

    List container = new ArrayList();

    public void add(Object o){
        container.add(o);
    }

    public int getSize(){
        return container.size();
    }

    public static void main(String[] args) {
        MyContainer1 myContainer1 = new MyContainer1();

        new Thread(() ->{
            for(int i=0;i<10;i++){
                myContainer1.add(i);
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
                if(myContainer1.getSize() == 5){
                    System.out.println("thread t2 end !!!");
                    break;
                }
            }

        },"t2").start();


    }
}
