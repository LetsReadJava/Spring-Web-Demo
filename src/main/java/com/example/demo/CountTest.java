package com.example.demo;

import org.springframework.util.Assert;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CountTest implements CountInterface {

    public static int getMethodCountForName(Class<?> clazz, String methodName) {
        Assert.notNull(clazz, "Class must not be null");
        Assert.notNull(methodName, "Method name must not be null");
        int count = 0;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (methodName.equals(method.getName())) {
                count++;
            }
        }
        Class<?>[] ifcs = clazz.getInterfaces();
        for (Class<?> ifc : ifcs) {
            count += getMethodCountForName(ifc, methodName);
        }
        if (clazz.getSuperclass() != null) {
            count += getMethodCountForName(clazz.getSuperclass(), methodName);
        }
        return count;
    }

    @Override
    public void m() {

    }

    void m(int x) {

    }

    public static void main(String[] args) {
        int x = getMethodCountForName(CountTest.class, "m");
        System.out.println(x);


        List<Integer> x2 = new ArrayList<>(2);
        x2.add(3);
        for (Integer y : x2) {
            System.out.println("LOL" + y);
        }
    }
}
