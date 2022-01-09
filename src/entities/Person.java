package entities;

import java.util.ArrayList;

public class Person {

    private String fingerPrint;
    private ArrayList<String> peopleFingerPrints;

    public Person() {

    }

    public Person(String fingerPrint) {
        this.fingerPrint = fingerPrint;
        peopleFingerPrints = new ArrayList<>();
    }

    public void add() {
        peopleFingerPrints().add(getFingerPrint());
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }

    public ArrayList<String> peopleFingerPrints() {
        return peopleFingerPrints;
    }
}
