package concurrent;

/**
 * @ClassName ReentrantLockTest
 * @Description TODO
 * @Author zy
 * @Date 2020/6/8 下午5:37
 */
//重入锁
    // 可重入锁指的是可重复可递归调用的锁，在外层使用锁之后，
    // 在内层仍然可以使用，并且不发生死锁（前提得是同一个对象或者class），
    // 这样的锁就叫做可重入锁。ReentrantLock和synchronized都是可重入锁
public class ReentrantLockTest {

    public static synchronized void A(){
        System.out.println(Thread.currentThread().getName());
        B();
    }

    public static synchronized void B(){
        System.out.println(Thread.currentThread().getName());
    }

    //A方法和B方法同时输出了线程名称，表明即使递归使用synchronized也没有发生死锁，证明其是可重入的。
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(() -> A()).start();
        }
    }

}
