package life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ghity
 * @Date: 2020/7/4 12:21
 * life
 * jack
 */
public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        User user = applicationContext.getBean("user", User.class);
        applicationContext.close();
    }
}
