package com.abhi.firstSpring.Service.Impl;

import com.abhi.firstSpring.Service.GreetService;
import org.springframework.stereotype.Service;

@Service
public class GreetHelloServiceImpl implements GreetService {
    @Override
    public String sayHello(String name) {
        return "Hello"+name;
    }
}
