package designpattern.facade;

/**
 * @ClassName MainCkient
 * @Description TODO
 * @Author zy
 * @Date 2020/6/4 下午4:58
 */
//SubSystem（子系统角色）：在软件系统中可以有一个或者多个子系统角色，每一个子系统可以不是一个单独的类，而是一个类的集合，它实现子系统的功能；每一个子系统都可以被客户端直接调用，或者被外观角色调用，它处理由外观类传过来的请求；
// 子系统并不知道外观的存在，对于子系统而言，外观角色仅仅是另外一个客户端而已。
public class MainClient {
    public static void main(String[] args) {
        // 购买外观类，客户端并不知道里面调用了登录，订单和支付子系统
        ShopingFacade shopingFacade = new ShopingFacade();
        shopingFacade.shop("tom", "123");
    }
}
