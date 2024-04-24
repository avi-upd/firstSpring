package com.abhi.firstSpring.Controller;

import com.abhi.firstSpring.Service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FirstController {


    @Autowired
    GreetService greetService;

    public String sayHello(String name){

        return greetService.sayHello(name);
    }
}
