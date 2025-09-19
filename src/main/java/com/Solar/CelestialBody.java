package com.Solar;

import java.util.ArrayList;

public class CelestialBody {
    String name;
    double mass;

    public CelestialBody() {
    }

    public CelestialBody(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public boolean isPlanet(double otherBodies) {
        double mew = mass / otherBodies;
        if (mew > 100) {
            return true;
        } else {
            return false;
        }
    }
}
