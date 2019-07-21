package com.company.task2;

import com.company.task2.user.User;
import com.company.task2.user.UserGenerator;
import com.company.task2.user.utils.FootballTeamGenerationUtil;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserProcessing {
    static final int WEEK = 7;

    public static void processingUsers() {
        List<User> users = UserGenerator.generateUsers(50);

        Map<String, List<String>> groupsByTeam = users.stream()
                .filter(d -> d.getLoginDate().isAfter(LocalDate.now().minus(Period.ofDays(WEEK))))
                .collect(Collectors.groupingBy(User::getTeam, Collectors.mapping(User::getEmail, Collectors.toList())));

        System.out.println("This is a team Milan: " + groupsByTeam.get(FootballTeamGenerationUtil.getTeam(0)));
        System.out.println("This is a team Real: " + groupsByTeam.get(FootballTeamGenerationUtil.getTeam(1)));
        System.out.println("This is a team Liverpool: " + groupsByTeam.get(FootballTeamGenerationUtil.getTeam(2)));
    }
}
