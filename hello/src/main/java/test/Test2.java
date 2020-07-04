package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ghity
 * @Date: 2020/7/4 12:42
 * test
 * jack
 */
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("bean1.xml");
        Room room = ap.getBean("room", Room.class);
        room.see();
    }
}
