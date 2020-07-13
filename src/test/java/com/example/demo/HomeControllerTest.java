package com.example.demo;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class HomeControllerTest {

    @Test
    public void verifyHomeController() {
        String response = "Hello world";
        SoftAssertions.assertSoftly(assertions -> {
            assertions.assertThat(response).isEqualTo("Hello world");
        });
    }

}
