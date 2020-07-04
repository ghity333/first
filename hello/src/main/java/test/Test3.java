package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: ghity
 * @Date: 2020/7/4 12:46
 * test
 * jack
 */
public class Test3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        User1 user1 = applicationContext.getBean("user1", User1.class);
        List<String> list = user1.getList();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
