package guru.springframework.springdi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class FauxControllerTest {

    @Autowired
    private FauxController fauxController;

    @Test
    void test(){
        assertSame("dev", fauxController.dataSource());
    }
}