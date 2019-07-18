package com.company.task2.user;

import com.company.task2.user.utilit.Date;
import com.company.task2.user.utilit.Email;
import com.company.task2.user.utilit.Team;

import java.util.ArrayList;
import java.util.List;

public class UserGenerator {
    public static List<User> generateUsers(int numberOfUsers) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            users.add(new User(Email.generateEmail(numberOfUsers), Date.generateDate(), Team.generateTeam()));
        }
        return users;
    }
}
