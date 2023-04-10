package guru.springframework.springdi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertSame;

@ActiveProfiles("prod")
@SpringBootTest
class ProdFauxControllerTest {

    @Autowired
    private FauxController fauxController;

    @Test
    void test(){
        assertSame("prod", fauxController.dataSource());
    }
}