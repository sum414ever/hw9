package com.company.task1;

public class AdultOnly {
    public static void checkYourAge(int yourAge) {

        AgeMeter incorrectAgeMeter = age -> age < 1 || age > 101;

        if (incorrectAgeMeter.areYouAdult(yourAge)) {
            System.out.println("Dude, something wrong. It is incorrect age. Try again");

        } else {

            AgeMeter ageMeter = age -> age >= 18 && age < 101;//especially for @omilovskiy)
            if (ageMeter.areYouAdult(yourAge)) {

                System.out.println("Dude, you are really big boy, take a beer");
            } else {System.out.println("No no no, dude, you are so small, go home");}
        }
    }
}
