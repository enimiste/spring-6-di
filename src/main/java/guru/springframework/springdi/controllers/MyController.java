package guru.springframework.springdi.controllers;

import guru.springframework.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return "%s from @%s controller object".formatted(greetingService.greeting(),
                Integer.toHexString(hashCode()));
    }
}
