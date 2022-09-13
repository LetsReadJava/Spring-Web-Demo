package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    //@Qualifier(value="LOL")
    Test2 test2;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        test33();
    }

    public static void test3() {
        List<Test2> k = new ArrayList<>();
        k.add(new Test2());
        System.out.println(k.get(0).test1);
        test22(k);
        System.out.println(k.get(0).test1);
    }

    public static void test22(List<Test2> l) {
        l.get(0).test1 = new Test1();
    }

    public static void test33() {
        Test2 k = new Test2();
        System.out.println(k.test1);
        test222(k);
        System.out.println(k.test1);
    }

    public static void test222(Test2 l) {
        l.test1 = new Test1();
    }

}
