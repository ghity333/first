package construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ghity
 * @Date: 2020/7/4 12:17
 * construct
 * jack
 */
public class Test1 {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
        Cart cart1 = ap.getBean("cart1", Cart.class);
        cart1.add();
    }
}
