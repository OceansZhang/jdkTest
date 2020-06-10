package designpattern.template;

/**
 * @ClassName MaiinClient
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 下午3:09
 */
//由于试卷是一样的，所以完全可以抽象成父类，然后在子类中去填写答案，
// 这样就是通过把不变的行为搬移到超类，去除子类中的重复代码，这也是模板方法的特点。
    //使用过Servlet的人都清楚，需要继承一个叫HttpServlet的抽象类。
    // HttpServlet类提供了一个service()方法，这个方法调用七个do方法中的一个或几个，完成对客户端调用的响应。这些do方法需要由HttpServlet的具体子类提供，因此这是典型的模板方法模式。下面是service()方法的源代码。
public class MaiinClient {
    public static void main(String[] args) {
        TestPaper testPaper = null;

        System.out.println("学生A答题");
        testPaper = new StudentAPaper();
        testPaper.answerQuestion();

        System.out.println("----------------------------");

        System.out.println("学生B答题");
        testPaper = new StudentBPaper();
        testPaper.answerQuestion();
    }

}
