package com.dubbo;


import com.alibaba.dubbo.config.annotation.Reference;

import java.util.List;

public class HelloServiceImpl implements HelloService {

    @Reference
    private DemoService demoService;

    @Override
    public List<String> sayHello() {
        return demoService.getPermission(3L);
    }
}
