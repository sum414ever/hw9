package com.company.task2.user.utils;

import java.util.Random;

public class FootballTeamGenerationUtil {
    private static String[] teams = {"Milan", "Real", "Liverpool"};

    public static String generateTeam() {
        return teams[new Random().nextInt(teams.length)];
    }

    public static String getTeam(int team) {
        return teams[team];
    }
}
