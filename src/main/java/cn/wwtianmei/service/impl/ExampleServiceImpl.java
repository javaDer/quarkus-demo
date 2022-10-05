package cn.wwtianmei.service.impl;

import cn.wwtianmei.service.ExampleService;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExampleServiceImpl implements ExampleService {
    @Override
    public String sayHello(String str) {
        return "Hello " + str;
    }
}
