package com.demobuild.demojenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MainControllerTest {

    private MainController controller;

    @Test
    void sayHelloWorld() {
        assertEquals("Hello World", controller.sayHelloWorld());
    }
}