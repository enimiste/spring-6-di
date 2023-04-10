package guru.springframework.springdi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertSame;

@ActiveProfiles("uat")
@SpringBootTest
class UatFauxControllerTest {

    @Autowired
    private FauxController fauxController;

    @Test
    void test(){
        assertSame("uat", fauxController.dataSource());
    }
}