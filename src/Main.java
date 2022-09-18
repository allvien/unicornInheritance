package enhörningInheritance.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    System.out.println("This is my inheritance practis");

    System.out.println("As you can tell, it´s not done yet! ");

    Horse horseWithWings = new Horse("Pegasus", 520);
    Horse horseWithManyLegs = new Horse("Sleipner", 4500);

    Dog scaryDog = new Dog(3,"Cujo", 3, 0);
    Dog cartoonDog = new Dog (4, "Pluto", 20, 4800000);

    List<Animals> animals= new ArrayList<>();
    animals.add(horseWithWings);
    animals.add(horseWithManyLegs);
    animals.add(scaryDog);
    animals.add(cartoonDog);

    for (Animals animal : animals){
        if (animal instanceof Horse) {
            Horse horse = (Horse)animal;
            horse.printHorseDetails();
        }
        else if(animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.printDogDetails();
        }
    }
    }
}
