package set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ghity
 * @Date: 2020/7/4 12:31
 * set
 * jack
 */
public class Test1 {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
        People people1 = ap.getBean("people1", People.class);
        int age = people1.getAge();
        String name = people1.getName();
        System.out.println(name+"===="+age);
    }
}
