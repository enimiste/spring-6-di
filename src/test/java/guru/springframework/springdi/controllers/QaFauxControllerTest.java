package guru.springframework.springdi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertSame;

@ActiveProfiles("qa")
@SpringBootTest
class QaFauxControllerTest {

    @Autowired
    private FauxController fauxController;

    @Test
    void test(){
        assertSame("qa", fauxController.dataSource());
    }
}