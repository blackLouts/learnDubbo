package com.dubbo;

public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String helloWorld() {
        return "Hello World";
    }
}
