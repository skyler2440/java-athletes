package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Track");

        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Hockey");


        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Rugby");

        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Baseball");

    }
}
