package com.java_generics.example_2;

import com.java_generics.example_1.*;

public class Main {

    public static void main(String[] args) {

        Team<CricketPlayer> indian_team = new Team<>("Indian Team");

        CricketPlayer cricketPlayer1 = new CricketPlayer("Dhoni");
        CricketPlayer cricketPlayer2 = new CricketPlayer("Dhawan");
        CricketPlayer cricketPlayer3 = new CricketPlayer("Rahul");
        indian_team.addPlayer(cricketPlayer1);
        indian_team.addPlayer(cricketPlayer2);
        indian_team.addPlayer(cricketPlayer3);


        Team<CricketPlayer> pakistan_team = new Team<>("Pakistan");

        CricketPlayer cricketPlayer4 = new CricketPlayer("Taushif");
        CricketPlayer cricketPlayer5 = new CricketPlayer("Asif");
        CricketPlayer cricketPlayer6 = new CricketPlayer("Suknik");
        pakistan_team.addPlayer(cricketPlayer4);
        pakistan_team.addPlayer(cricketPlayer5);
        pakistan_team.addPlayer(cricketPlayer6);


        Team<FootBallPlayer> us_team = new Team<>("US");

        FootBallPlayer footBallPlayer1 = new FootBallPlayer("Cristiano Ronaldo");
        FootBallPlayer footBallPlayer2 = new FootBallPlayer("Ronaldo");
        FootBallPlayer footBallPlayer3 = new FootBallPlayer("Cirstiano");
        us_team.addPlayer(footBallPlayer1);
        us_team.addPlayer(footBallPlayer2);
        us_team.addPlayer(footBallPlayer3);


        Team<FootBallPlayer> britain_team = new Team<>("Britain");

        FootBallPlayer footBallPlayer4 = new FootBallPlayer("Messi");
        FootBallPlayer footBallPlayer5 = new FootBallPlayer("Harman");
        FootBallPlayer footBallPlayer6 = new FootBallPlayer("Kishore");
        britain_team.addPlayer(footBallPlayer4);
        britain_team.addPlayer(footBallPlayer5);
        britain_team.addPlayer(footBallPlayer6);


        indian_team.matchResult(pakistan_team, 5, 2);
        indian_team.matchResult(pakistan_team, 1, 1);

        us_team.matchResult(britain_team, 1, 5);
        britain_team.matchResult(us_team, 1, 1);


        League<Team<CricketPlayer>> leagueCricket = new League<>("IPL");
        leagueCricket.addTeam(indian_team);
        leagueCricket.addTeam(pakistan_team);

        League<Team<FootBallPlayer>> leagueFootBall = new League<>("IFL");
        leagueFootBall.addTeam(us_team);
        leagueFootBall.addTeam(britain_team);

        System.out.println("=========Top League=========");
        leagueCricket.showLeagueTable();

        System.out.println("=========Top League=========");
        leagueFootBall.showLeagueTable();

    }

}
