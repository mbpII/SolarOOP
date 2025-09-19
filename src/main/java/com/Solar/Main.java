package com.Solar;

public class Main {
    public static void main(String[] args) {
        CelestialBody pluto = new CelestialBody();
        pluto.setMass(1.309);

        new StarSystem.StarSystemBuilder()
                .addBody("Sol", 19890000)
                .addBody("Mercury", 3.3)
                .addBody("Venus", 48.7)
                .addBody("Earth", 59.7)
                .addBody("Mars", 6.42)
                .addBody("AstroidBelt", .023)
                .addBody("Jupiter", 19000)
                .addBody("Saturn", 5680)
                .addBody("Uranus", 860)
                .addBody("Neptune", 1020);


        double totalMass = StarSystem.getMass();
        System.out.println(pluto.isPlanet(totalMass));
    }
}