package com.alhroub.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class MyController {

    @Autowired
    private TestClass testClass;

    @Autowired
    private TestClass.TestClassInner testClassInner;

    @RequestMapping("/test")
    @ResponseBody
    public String hi(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return "test: " + testClass.i + " " + testClassInner.y;
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String hi1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return "You have been redircted!";
    }
}
