package com.company.task4.box;

import com.company.task4.thing.Thing;

import java.util.List;

public class Box {
    private List<Thing> things;
    private String boxName;

    public Box(List<Thing> things, String boxName) {
        this.things = things;
        this.boxName = boxName;
    }

    public List<Thing> getThings() {
        return things;
    }

    public void setThings(List<Thing> things) {
        this.things = things;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    @Override
    public String toString() {
        return "Box{" +
                "things=" + things +
                ", boxName='" + boxName + '\'' +
                '}';
    }
}
