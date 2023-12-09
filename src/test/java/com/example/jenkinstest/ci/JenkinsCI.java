package com.example.jenkinstest.ci;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class JenkinsCI {

    @Test
    public void 젠킨스_CI_테스트() {
        log.info("jenkins ci test");
        assertEquals(2, 2);
    }
}