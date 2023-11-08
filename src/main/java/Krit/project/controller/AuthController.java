package Krit.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/hello")
    public String helloWorld(){
//        boolean isError = true;
//        if (isError) {
//            throw new RuntimeException("An error occurred!");
//        }
        return "Hello World!";
    }
}
