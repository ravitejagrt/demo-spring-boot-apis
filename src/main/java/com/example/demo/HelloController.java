package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {
		"http://localhost:3000",
		"https://ravitejagrt.github.io/my-first-react-app/"
})
public class HelloController {

    @GetMapping("/helloWorld")
    public String hello() {
        return "Hello World123";
    }
}
