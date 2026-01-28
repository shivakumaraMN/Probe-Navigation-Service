package com.probe.service;

import com.probe.domain.Probe;
import org.springframework.stereotype.Service;

@Service
public class NavigationService {

    public NavigationResult navigate(NavigationRequest request) {
        Probe probe = buildProbe(request);
        for (char c : request.getCommands().toCharArray()) {
            switch (c) {
                case 'F' -> probe.moveForward(grid);
                case 'B' -> probe.moveBackward(grid);
                case 'L' -> probe.turnLeft();
                case 'R' -> probe.turnRight();
                default -> throw new InvalidCommandException(c);
            }
        }
        return NavigationResult.from(probe);
    }
}
