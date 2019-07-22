package com.company;

import com.company.task1.AdultOnly;
import com.company.task2.UserProcessing;
import com.company.task3.MovieProcessing;
import com.company.task4.BoxProcessing;

import java.util.Scanner;

public class AppRunner {
    static final int ADULT_CHECKING_TASK = 1;
    static final int SEPARATE_BY_TEAMS = 2;
    static final int AVERAGE_MOVIE_PRICE_TASK = 3;
    static final int PACK_THINGS_IN_BOXES = 4;
    static final int EXIT = 5;

    public void run() {
        System.out.println("Hey, dude, what do you want?  ");
        System.out.println("Write 1, if you want check are you adult ");
        System.out.println("Write 2, if you want to separate another dudes by teams ");
        System.out.println("Write 3, if you want to know average price films by genre ");
        System.out.println("Write 4, if you want to pack things in boxes and protected delicate things ");
        System.out.println("Write 5, if you want exit");


        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        while (input != EXIT) {
            switch (input) {
                case ADULT_CHECKING_TASK:
                    System.out.println("Stop, how old are you, dude?");
                    AdultOnly.checkYourAge(scan.nextInt());
                    break;
                case SEPARATE_BY_TEAMS:
                    UserProcessing.processingUsers();
                    break;
                case AVERAGE_MOVIE_PRICE_TASK:
                    MovieProcessing.processingMovies();
                    break;
                case PACK_THINGS_IN_BOXES:
                    BoxProcessing.processingBox();
                    break;
                default:
                    System.out.println("Dude, this is error case");
                    break;
            }
            input = scan.nextInt();
        }
    }
}
