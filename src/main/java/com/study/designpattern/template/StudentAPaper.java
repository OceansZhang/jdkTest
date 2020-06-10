package designpattern.template;

/**
 * @ClassName StudentAPaper
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 下午3:08
 */
public class StudentAPaper extends TestPaper{
    @Override
    String answer1() {
        return "B";
    }

    @Override
    String answer2() {
        return "A";
    }

    @Override
    String answer3() {
        return "C";
    }
}
