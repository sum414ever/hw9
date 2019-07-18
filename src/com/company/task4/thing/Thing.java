package com.company.task4.thing;

public class Thing {
    private boolean isItDelicate;
    private String thingName;

    public Thing(boolean isItDelicate, String thingName) {
        this.isItDelicate = isItDelicate;
        this.thingName = thingName;
    }

    public boolean isItDelicate() {
        return isItDelicate;
    }

    public void setItDelicate(boolean itDelicate) {
        isItDelicate = itDelicate;
    }

    public String getThingName() {
        return thingName;
    }

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "isItDelicate=" + isItDelicate +
                ", thingName='" + thingName + '\'' +
                '}';
    }
}
