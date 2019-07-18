package com.company.task4.thing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThingGenerator {

    public static List<Thing> generateThing(int numbersOfThings) {
        List<Thing> things = new ArrayList<>();

        for (int i = 0; i < numbersOfThings; i++) {
            int rand = new Random().nextInt(numbersOfThings);
            boolean isItDelicate = rand % 2 == 0;//if int is even thing is delicate
            String name = "Thing " + new Random().nextInt(Integer.MAX_VALUE);
            things.add(new Thing(isItDelicate, name));
        }
        return things;
    }
}
