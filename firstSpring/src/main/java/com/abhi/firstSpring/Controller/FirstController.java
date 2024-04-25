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


/**
 *
 API DESIGN STEPS:

 1. Tech Discussions, meeting, etc.
 2. Business Logic.
 3. API design and documentation
 4. API Contract -> final step before development of API
 --> Server tools which maintain the API contract and design: Swagger,
 5. API development
 6. API server
 7. Maintenance or Update

 CRUD

 Create -> some data from client
 Retrieve -> Id from client
 Update -> Id + data
 Delete -> Id
 *
 * Bad Practice as URL is not safe and is exposed (what if we want to send sensitive info
 *
 * /pet/create
 * /pet/update
 * /pet/retrieve
 * /pet/delete
 *
 *
 * Therefore This method is safe
 *
 * HTTPS types Or API types
 *
 * 1. GET -> Retrieve
 * 2. POST -> Create a new data
 * 3. PUT -> Update - Replace the whole resource(data)
 * 4. PATCH -> Partial Update - Update certain parts of the same resource
 * 5. DELETE -> Delete Resource
 *
 * OPTIONS / HEAD / TRACEs (Not so frequently used)
 *
 * HTTPS Status Codes :  https://developer.mozilla.org/en-US/docs/Web/HTTP/Status
 *
 *
 *
 *
 *
 * **/
