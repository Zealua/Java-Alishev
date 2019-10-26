package ua.course.java.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "aplicationContext.xml"
        );

        TestBean testBean = context.getBean("testBean",TestBean.class);

        System.out.println(testBean.getName());
        context.close();
    }
}
