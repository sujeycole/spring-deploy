package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //para comunicarme con applicatio.properties
    @Value("${app.message}")
    String message;

   // @Value("${app.varexample}")
   // String message1;

    @GetMapping("/hola")
    public String saludo(){
        System.out.println(message);
       // System.out.println(message1);
        return "Hola mundo";
    }
}
