import com.baisu.spring.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ghity
 * @Date: 2020/7/4 10:50
 * PACKAGE_NAME
 * jack
 */
public class testSpring {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
        Student student = ap.getBean("student", Student.class);
        student.hello();
    }
}
