package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ghity
 * @Date: 2020/7/4 12:10
 * test
 * jack
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
        Cart cart = ap.getBean("cart", Cart.class);
        cart.getUserDao().add();

    }
}
