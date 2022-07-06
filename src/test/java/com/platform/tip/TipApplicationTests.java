package com.platform.tip;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TipApplicationTests {

    @Test
    void contextLoads() {
        String version = SpringBootVersion.getVersion();
        System.out.println(version);
    }

}
