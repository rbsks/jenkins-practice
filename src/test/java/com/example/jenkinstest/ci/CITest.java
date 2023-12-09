package com.example.jenkinstest.ci;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class CITest {

    @Test
    public void 테스트코드_실패_테스트() {
        log.info("테스트코드 실패 test");
        assertEquals(1, 2);
    }
}