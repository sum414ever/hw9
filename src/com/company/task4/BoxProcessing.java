package com.company.task4;

import com.company.task4.box.Box;
import com.company.task4.thing.Protector;
import com.company.task4.thing.Thing;
import com.company.task4.thing.ThingGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BoxProcessing {

    public static void processingBox() {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(ThingGenerator.generateThing(50), "firstBox"));
        boxes.add(new Box(ThingGenerator.generateThing(20), "secondBox"));
        boxes.add(new Box(ThingGenerator.generateThing(50), "thirdBox"));

        List<Protector> delicateThings = boxes.stream()
                .flatMap(box -> box.getThings().stream())
                .filter(Thing::isItDelicate)
                .map(Protector::new)
                .collect(Collectors.toList());

        System.out.println(delicateThings);
    }
}