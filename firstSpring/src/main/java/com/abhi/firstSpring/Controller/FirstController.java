package com.abhi.firstSpring.Controller;

import com.abhi.firstSpring.Service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


    @Autowired
    GreetService greetService;


    @GetMapping("/greet")
    public String sayHello(String name){
        System.out.println("I am being called for /greet");
        return greetService.sayHello(name);
    }
}


/**   ***********************************----NOTES----**************************************
 *
 API DESIGN STEPS:

 1. Tech Discussions, meeting, etc.
 2. Business Logic.
 3. API design and documentation
 4. API Contract -> final step before development of API
    Server tools which maintain the API contract and design: Swagger,
 5. API development
 6. API server
 7. Maintenance or Update

 CRUD

 Create -> some data from client
 Retrieve -> Id from client
 Update -> Id + data
 Delete -> Id
 *
 *
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
 *  Stateful vs Stateless
 *
 *  SOAP -> SOAP APIs
 *
 *  https://domain/getTransactions -> 1-10
 *  https://domain/getTransactions -> 11-20
 *  https://domain/getTransactions -> 21-30
 *
 *
 *  <?xml version="1.0" encoding="utf-8"?>
 * <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:prod="http://example.com/product">
 *   <soap:Header />
 *   <soap:Body>
 *     <prod:GetProductInfo>
 *       <prod:productId>123</prod:productId>
 *     </prod:GetProductInfo>
 *   </soap:Body>
 * </soap:Envelope>
 *
 *
 * REST -> Representational State Transfer
 * ->No need of xml hardcoded structure but simply
 *  {
 *      "movie_name" : "name"
 *      "movie_rating" : rating
 *  }
 *
 *  -> I(server) will not maintain a state , so you(client) have to give me all the info every time you request(since I don't maintain a state)
 *
 * https://domain/getTransactions/?start=1&end=10
 * https://domain/getTransactions/?start=11&end=20
 *
 * Since I am not maintaining any states, you have to pass me the info , start and end
 *
 *
 *
 * Safety : One Time Call : If an API request modifies the data is unsafe
 *
 * GET -> Safe
 * POST -> Unsafe
 * PUT -> Unsafe
 * PATCH -> Unsafe
 * DELETE -> Unsafe
 * HEAD -> safe
 *
 * Idempotency comes into the picture when there are multiple calls :
 *
     Logging Levels

     TRACE -> minute level details for extreme debugging
     DEBUG -> detailed information needed while debugging
     INFO -> General information of the process for hints
     WARN -> Warnings for potential issues that could lead to errors if not addressed.
     ERROR -> Important and Crucial

    System.out.println("I am called for greet")
    Logger.debug("I am called for greet")
    Logger.error("Here is the exception")
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * **/
