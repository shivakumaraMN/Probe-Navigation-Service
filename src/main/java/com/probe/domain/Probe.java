package com.probe.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Probe {

    private Position position;
    private Direction direction;
    private final List<Position> visited = new ArrayList<>();

    public Probe(Position start, Direction direction) {
        this.position = start;
        this.direction = direction;
        visited.add(start);
    }

    public void moveForward(Grid grid) {
        Position next = position.move(directionDx(), directionDy());
        grid.validate(next);
        position = next;
        visited.add(position);
    }
}