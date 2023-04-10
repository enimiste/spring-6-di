package guru.springframework.springdi.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("dev")
@SpringBootTest
class DevFauxControllerTest {

    @Autowired
    private FauxController fauxController;

    @Test
    void test(){
        assertSame("dev", fauxController.dataSource());
    }
}