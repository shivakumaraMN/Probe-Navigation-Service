package com.probe.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(ProbeController.class)
class ProbeControllerTest {

    @Test
    void shouldReturnFinalPosition() throws Exception {
        mockMvc.perform(post("/api/v1/probe/navigate")
                        .contentType(APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk());
    }
}
