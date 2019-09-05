package com.lambdaschool.solution;

public class HockeyAthleteImpl implements Athlete
{
    @Override
    public void displayAthlete(String sport)
    {
        System.out.println(sport +" "+"Goalie");
    }
}
