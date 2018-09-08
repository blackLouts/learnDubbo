package com.dubbo;

import org.springframework.beans.factory.annotation.Autowired;

public class WorldServiceImpl implements WorldService {

    @Autowired
    private HelloWorldService helloWorldService;

    @Override
    public String sayWorld() {
        return helloWorldService.helloWorld();
    }
}
