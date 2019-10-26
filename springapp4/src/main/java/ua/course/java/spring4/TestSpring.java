package ua.course.java.spring4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );
        TestBeen testBeen = context.getBean("testBean",TestBeen.class);
        System.out.println(testBeen.getName());
        context.close();
    }
}
