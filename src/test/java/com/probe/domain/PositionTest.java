package com.probe.domain;

import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    void shouldMoveForwardNorth() {
        Position start = new Position(1, 1);
        Position result = start.move(0, 1);
        assertEquals(new Position(1, 2), result);
    }
}
