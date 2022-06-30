package com.java_generics.example_2;

import com.java_generics.example_1.Team;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> league;

    public League(String name) {
        this.name = name;
        this.league = new ArrayList<>();
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println(team.getName() + " already exists in league");
            return false;
        } else {
            league.add(team);
            System.out.println(team.getName() + " added to league");
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);

        for (T team : league)
            System.out.println(team.getName());
    }

}
