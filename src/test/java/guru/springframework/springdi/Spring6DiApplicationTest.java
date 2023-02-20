package guru.springframework.springdi;

import guru.springframework.springdi.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTest {

    @Autowired
    ApplicationContext context;

    @Autowired
    MyController controller;

    @Test
    void controller_from_context() {
        System.out.println(context.getBean(MyController.class).sayHello());
        System.out.println(context.getBean(MyController.class).sayHello());
        System.out.println(context.getBean(MyController.class).sayHello());
    }

    @Test
    void controller_autowired() {
        System.out.println(controller.sayHello());
        System.out.println(controller.sayHello());
        System.out.println(controller.sayHello());
    }
}