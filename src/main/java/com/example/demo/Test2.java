package com.example.demo;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.text.html.Option;
import java.util.*;

@Component/*(value="Test3")*/
public class Test2 {

    @Autowired
    Test1 test1;

    /*Test1 test1Init = new Test1();

    @Value("#{test1Init.x}")
    String s;*/


    @PostConstruct
    public void init() {
        System.out.println(test1 == null);
        System.out.println("Hello World! 2");
        //System.out.println("TEST" + s);
        System.out.println("Line init()" + f());
        Set<Integer> x = new HashSet<>();
    }

    public List<String> f() {
        List<String> x = new ArrayList<>();
        x.add("A");
        try {
            return x;
        } finally {
            x.clear();
            System.out.println("Line f()");
        }
    }

    public int g() {
        System.out.println("Line g()");
        return 2;
    }

    public void h() {
        List<Banane> l = new ArrayList<>();
        List<Obst> l2 = new ArrayList<>();
        h2(l2);
    }

    public void h2(List<? extends Obst> o) {

        Mensch m = new Mensch();
        func(m);

    }

    public <T extends HatArme & HatBeine> void func(T x) {
        x.getArme();
        x.getBeine();
    }
}


