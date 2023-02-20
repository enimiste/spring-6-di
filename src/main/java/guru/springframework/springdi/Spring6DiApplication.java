package guru.springframework.springdi;

import guru.springframework.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(Spring6DiApplication.class, args);

        var controller = context.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }

}
