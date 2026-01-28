package com.probe.domain;

public class GridTest {

    @Test
    void shouldThrowExceptionWhenMovingOutsideGrid() {
        Grid grid = new Grid(5, 5, Set.of());
        assertThrows(OutOfGridException.class,
                () -> grid.validate(new Position(6, 1)));
    }

}
