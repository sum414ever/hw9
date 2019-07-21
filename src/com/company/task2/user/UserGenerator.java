package com.company.task2.user;

import com.company.task2.user.utils.DateGeneratorUtil;
import com.company.task2.user.utils.EmailGeneratorUtil;
import com.company.task2.user.utils.FootballTeamGenerationUtil;

import java.util.ArrayList;
import java.util.List;

public class UserGenerator {

    public static List<User> generateUsers(int quantity) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {

            users.add(new User(EmailGeneratorUtil.generateEmail(quantity), DateGeneratorUtil.generateDate(), FootballTeamGenerationUtil.generateTeam()));
        }
        return users;
    }
}
