package designpattern.template;

/**
 * @ClassName StudentBPaper
 * @Description TODO
 * @Author zy
 * @Date 2020/6/2 下午3:09
 */
public class StudentBPaper extends TestPaper{

    @Override
    String answer1() {
        return "C";
    }

    @Override
    String answer2() {
        return "B";
    }

    @Override
    String answer3() {
        return "A";
    }
}
