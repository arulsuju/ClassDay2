package com.example.first;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Instructor instructor=context.getBean("computer",Instructor.class);
        System.out.println(instructor);
        System.out.println(instructor.getInfo());
        System.out.println(instructor.getExp());
        System.out.println(instructor.getFees());
        System.out.println(instructor.getFortune());

        Instructor javainstructor=context.getBean("computer",Instructor.class);
        System.out.println(javainstructor);
        System.out.println(javainstructor.getInfo());
        System.out.println(javainstructor.getExp());
        System.out.println(javainstructor.getFees());
        System.out.println(javainstructor.getFortune());




    }
}
