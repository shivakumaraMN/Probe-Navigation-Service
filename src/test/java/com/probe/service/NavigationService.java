package com.probe.service;

import org.junit.jupiter.api.Test;

public class NavigationService {

    @Test
    void shouldExecuteCommandSequence() {
        NavigationService service = new NavigationService();
        NavigationResult result = service.navigate("FFR");

        assertEquals(Direction.E, result.direction());
    }

}
