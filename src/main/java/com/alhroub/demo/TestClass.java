package com.alhroub.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TestClass {
    public int i = 2;


    @Bean
    public TestClassInner testClassInner() {
        return new TestClassInner();
    }


    static class TestClassInner {
        public int y = 3;
    }
}
