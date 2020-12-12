package pl.sda.spring.demo.ex7;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Task07ControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void should_return_proper_status(){
        //when
        final ResponseEntity<Void> response = testRestTemplate.getForEntity("/task07", Void.class);

        //then
        assertEquals(HttpStatus.I_AM_A_TEAPOT, response.getStatusCode());
    }
}
