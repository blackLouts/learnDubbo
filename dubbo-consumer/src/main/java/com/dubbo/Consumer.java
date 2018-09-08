package com.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class Consumer {

    @Reference
    private DemoService demoService;

    @Reference
    private HelloService helloService;

    @Reference
    private WorldService worldService;

    @Reference
    private HelloWorldService helloWorldService;

    /**
     * consumer --> api --> providerB
     */
    @RequestMapping("test0")
    public @ResponseBody void demo() {
        System.out.println(demoService.getPermission(1L));
    }

    /**
     * consumer --> api --> providerA
     */
    @RequestMapping("test1")
    public @ResponseBody void test() {
        System.out.println(helloWorldService.helloWorld());
    }

    /**
     * consumer --> api -- providerA --> providerB
     */
    @RequestMapping("test2")
    public @ResponseBody void hello() {
        System.out.println(helloService.sayHello());
    }

    /**
     * consumer --> api -- providerA --> providerA
     */
    @RequestMapping("test3")
    public @ResponseBody void world() {
        System.out.println(worldService.sayWorld());
    }
}
