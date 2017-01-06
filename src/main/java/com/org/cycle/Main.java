package com.org.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yyp on 2017/1/6 0006.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cycle.xml");

        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        // ¹Ø±Õ IOC ÈÝÆ÷
        ctx.close();
    }
}
