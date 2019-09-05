package com.lambdaschool.solution;

public class TrackAthleteImpl implements Athlete
{
    @Override
    public void displayAthlete(String sport)
    {
        System.out.println(sport +" "+"Runner");
    }
}
