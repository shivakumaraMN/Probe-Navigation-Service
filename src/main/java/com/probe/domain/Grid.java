package com.probe.domain;

public class Grid {

    private final int width;
    private final int height;
    private final Set<Position> obstacles;

    public void validate(Position position) {
        if (position.x() < 0 || position.y() < 0 ||
                position.x() >= width || position.y() >= height) {
            throw new OutOfGridException(position);
        }
        if (obstacles.contains(position)) {
            throw new ObstacleDetectedException(position);
        }
    }
}
