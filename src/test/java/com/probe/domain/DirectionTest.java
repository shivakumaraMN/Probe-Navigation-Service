package com.probe.domain;

public class DirectionTest {

    @Test
    void northTurnsLeftToWest() {
        assertEquals(Direction.W, Direction.N.turnLeft());
    }

    @Test
    void northTurnsRightToEast() {
        assertEquals(Direction.E, Direction.N.turnRight());
    }
}

