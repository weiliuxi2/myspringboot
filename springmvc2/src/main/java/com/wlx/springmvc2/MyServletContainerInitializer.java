package com.wlx.springmvc2;

import com.wlx.springmvc2.test.Test;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes(Test.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        System.out.println("aaaaaaa111111");
        for (Class ca : c) {
            System.out.println(ca.getClass().getName());
        }
    }
}
