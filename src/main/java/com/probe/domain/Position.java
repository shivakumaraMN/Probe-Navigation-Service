package com.probe.domain;

import lombok.Value;

@Value
public class Position {
    int x;
    int y;

    public Position move(int dx, int dy) {
        return new Position(x + dx, y + dy);
    }
}
