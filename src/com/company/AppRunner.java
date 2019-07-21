package com.company;

import com.company.task1.AdultOnly;
import com.company.task2.UserProcessing;
import com.company.task3.MovieProcessing;
import com.company.task4.BoxProcessing;

import java.util.Scanner;

public class AppRunner {
    static final int ONE =1;
    static final int TWO =2;
    static final int THREE =3;
    static final int FOUR =4;
    static final int FIVE =5;

    public void run() {
        System.out.println("Hey, dude, what do you want?  ");
        System.out.println("Write 1, if you want check are you adult ");
        System.out.println("Write 2, if you want to separate another dudes by teams ");
        System.out.println("Write 3, if you want to know average price films by genre ");
        System.out.println("Write 4, if you want to pack things in boxes and protected delicate things ");
        System.out.println("Write 5, if you want exit");


        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        while (input != FIVE) {
            switch (input) {
                case ONE:
                    System.out.println("Stop, how old are you, dude?");
                    AdultOnly.checkYourAge(scan.nextInt());
                    break;
                case TWO:
                    UserProcessing.processingUsers();
                    break;
                case THREE:
                    MovieProcessing.processingMovies();
                    break;
                case FOUR:
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
