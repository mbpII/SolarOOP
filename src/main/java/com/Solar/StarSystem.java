package com.Solar;

import java.util.ArrayList;
import java.util.List;

public class StarSystem {
    private static List<CelestialBody> celestialBodies = new ArrayList<>();

    public static class StarSystemBuilder {
        public StarSystemBuilder addBody(String name, double mass) {
            celestialBodies.add(new CelestialBody(name, mass));
            return this;
        }

        public List<CelestialBody>build () {
            return celestialBodies;
        }
    }

    public static double getMass() {
        int sum = 0;
        for (CelestialBody body : celestialBodies) {
            sum += (int) body.getMass();
        }
        return sum;
    }
}
