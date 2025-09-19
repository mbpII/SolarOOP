# Solar System OOP Project

This Java project models a solar system using object-oriented principles and the Builder Pattern for easy construction of celestial bodies.

## Features

• CelestialBody class: Represents celestial bodies with name, mass, and planet classification.
• StarSystem class: Uses a Builder to add bodies and compute total mass.
• isPlanet() method: Determines if a body is a planet based on mass ratio (>100) against other bodies' total mass.

## Usage

In Main.java:
`
CelestialBody pluto = new CelestialBody();
pluto.setMass(1.309);

List<CelestialBody> system = new StarSystem.StarSystemBuilder()
    .addBody("Sol", 19890000)
    .addBody("Earth", 59.7)
     ... more bodies
    .build();

double totalMass = StarSystem.getMass();
System.out.println(pluto.isPlanet(totalMass));
`
## Notes

• Masses are in arbitrary units (e.g., Earth masses).
• Builder accumulates bodies in a static list; compute total mass after building.
• Ensure isPlanet() receives total mass minus the body's own mass for accurate ratio.

Build with mvn compile exec:java -Dexec.mainClass="com.Solar.Main".
