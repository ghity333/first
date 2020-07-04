package com.baisu.spring;

import com.sun.org.apache.xml.internal.utils.XML11Char;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;

/**
 * @Author: ghity
 * @Date: 2020/7/4 11:00
 * com.baisu.spring
 * jack
 */
public class Test2 {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("bean.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        Student student = factory.getBean("student", Student.class);
        System.out.println(student);
    }
}
