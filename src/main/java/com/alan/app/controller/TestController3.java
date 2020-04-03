package com.alan.app.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController3 {

    protected static final Logger logger = LoggerFactory.getLogger(TestController3.class);

    @RequestMapping("/test3")
    public String showText()
    {
        logger.info("===系统调用了TestController3===");
        return "TestController3!";
    }
}
