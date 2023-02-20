package guru.springframework.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        return "Hello from @%s controller object".formatted(Integer.toHexString(hashCode()));
    }
}
