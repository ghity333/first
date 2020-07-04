package test;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @Author: ghity
 * @Date: 2020/7/4 12:38
 * test
 * jack
 */
@Component("user")
public class User {
    public void see(){
        System.out.println("hello user");
    }
}
