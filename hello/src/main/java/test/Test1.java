package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ghity
 * @Date: 2020/7/4 12:39
 * test
 * jack
 */
public class Test1 {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("bean1.xml");
        User user = ap.getBean("user", User.class);
        System.out.println(user);
    }
}
