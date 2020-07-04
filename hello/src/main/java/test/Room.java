package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: ghity
 * @Date: 2020/7/4 12:40
 * test
 * jack
 */
@Component("room")
public class Room {
    @Autowired
    private User user;
    public void see(){
        user.see();
    }
}
