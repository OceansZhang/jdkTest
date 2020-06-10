package designpattern.facade;

/**
 * @ClassName ShopingFacade
 * @Description TODO
 * @Author zy
 * @Date 2020/6/4 下午4:57
 */
//Facade（外观角色）：在客户端可以调用它的方法，在外观角色中可以知道相关的（一个或者多个）子系统的功能和责任；
// 在正常情况下，它将所有从客户端发来的请求委派到相应的子系统去，传递给相应的子系统对象处理。
    //购物外观类
public class ShopingFacade {
    private Login loginHelp;
    private Order orderHelp;
    private Pay payHelp;

    public ShopingFacade(){
        this.loginHelp = new Login();
        this.orderHelp = new Order();
        this.payHelp = new Pay();
    }

    // 用户购买商品
    public void shop(String userName, String password){
        loginHelp.login();
        orderHelp.createOrder();
        payHelp.pay();
    }
}
