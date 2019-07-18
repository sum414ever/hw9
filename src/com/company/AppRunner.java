package com.company;

import com.company.task1.AdultOnly;
import com.company.task2.UserProcessing;
import com.company.task3.MovieProcessing;
import com.company.task4.BoxProcessing;

import java.util.Scanner;

public class AppRunner {
    public void Run() {
        System.out.println("Hey, dude, what do you want?  ");
        System.out.println("Write 1, if you want check are you adult ");
        System.out.println("Write 2, if you want to separate another dudes by teams ");
        System.out.println("Write 3, if you want to know average price films by genre ");
        System.out.println("Write 4, if you want to pack things in boxes and protected delicate things ");


        Scanner scan = new Scanner(System.in);
        int switchCase = scan.nextInt();

        do {
            switch (switchCase) {
                case 1:
                    System.out.println("Stop, how old are you, dude?");
                    AdultOnly.checkYourAge(scan.nextInt());
                    break;
                case 2:
                    UserProcessing.processingUsers();
                    break;

                case 3:
                    MovieProcessing.processingMovies();
                    break;
                case 4:
                    BoxProcessing.processingBox();
                    break;
                default:
                    System.out.println("Dude, this is error case");
                    break;
            }
            scan = new Scanner(System.in);
            switchCase = scan.nextInt();
        }
        while (switchCase > 0 && switchCase < 2);
    }
}
