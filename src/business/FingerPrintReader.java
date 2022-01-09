package business;

import entities.Elevator;
import entities.Person;

public class FingerPrintReader extends BaseReader{

    public Elevator elevator = new Elevator();
    Person person = new Person("ABC");

    public void isMatches(String fingerPrint){
        person.add();
        System.out.println("FingerPrint is checking. ");
        for(int i=0; i<person.peopleFingerPrints().size();i++){
            if(person.peopleFingerPrints().get(i).equals(fingerPrint)){
                System.out.println("FingerPrint is matches. ");
                elevator.comeElevator();
            }else {
                System.out.println("FingerPrint is not matches. ");
            }
        }
    }

}
