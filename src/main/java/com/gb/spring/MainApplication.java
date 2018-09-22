package com.gb.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        //контекст будет создаваться из XML файла
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //вызвали экземпляр бина у контекста
        CodeCreator javaCC = context.getBean("javaCodeCreator", CodeCreator.class);
        //обратились к методу экземпляра
        System.out.println(javaCC.getClassExample());

        context.close();
    }
}
