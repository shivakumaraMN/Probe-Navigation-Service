package com.probe.domain;

public class ProbTest {

    @Test
    void probeShouldMoveForwardAndTrackVisitedPositions() {
        Grid grid = new Grid(5, 5, Set.of());
        Probe probe = new Probe(new Position(1,1), Direction.N);

        probe.moveForward(grid);

        assertEquals(new Position(1,2), probe.getPosition());
        assertEquals(2, probe.getVisited().size());
    }

}
