package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Test1 {

    String x = "X";

    boolean test() {
        return "S" + "S" == "SS";
    }

    /**
     * N1 = NullBean()
     * N2 = NullBean()
     * N1 == null
     * null == N2
     * N1 != N2
     *
     * A == B && B == C -> A == C
     */

    @PostConstruct
    public void init() {
        System.out.println("Hello World! 1");
    }

}
