package programmerzamannow.aop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void helloService() {
        Assertions.assertEquals("Hello Hanif", helloService.hello("Hanif"));
        Assertions.assertEquals("Hello Hanif Faiz", helloService.hello("Hanif","Faiz"));
        Assertions.assertEquals("Bye Hanif", helloService.bye("Hanif"));

        helloService.test();
    }
}
