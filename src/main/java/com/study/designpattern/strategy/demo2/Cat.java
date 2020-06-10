package designpattern.strategy.demo2;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author zy
 * @Date 2020/6/9 下午5:06
 */
public class Cat{
    int weight,height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
