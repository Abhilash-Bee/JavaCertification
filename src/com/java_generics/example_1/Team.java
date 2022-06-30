package com.java_generics.example_1;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    private int matchesPlayed;
    private int matchesWon;
    private int matchesLost;
    private int matchesTied;
    ArrayList<T> teamMembers;

    public Team(String name) {
        this.name = name;
        this.teamMembers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (teamMembers.contains(player)) {
            System.out.println(player.getName() + " is already in the team");
            return false;
        } else {
            System.out.println(player.getName() + " picked by " + this.getName());
            teamMembers.add(player);
            return true;
        }
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            message = " beat ";
            this.matchesWon++;
        } else if(ourScore < theirScore) {
            message = " lost by ";
            this.matchesLost++;
        } else {
            message = " drew with ";
            this.matchesTied++;
        }
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int getRanking() {
        return (this.matchesWon * 2) + this.matchesTied;
    }

    @Override
    public int compareTo(@NotNull Team<T> team) {
        return Integer.compare(team.getRanking(), this.getRanking());
    }
}
