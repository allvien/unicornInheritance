package enhörningInheritance.src;

public class Dog extends Animals {

    String name;
    int age;


    public Dog(long animalID, String name, int age, int price) {
        this.animalId = animalID;
        this.price = price;
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void printDogDetails() {
        System.out.println("This dogs id is: " + this.animalId);
        System.out.println("And this dog is named: " + this.name);
        System.out.println("This dog is: " + this.age + " years old.");
        System.out.println("This dog will cost you " + this.price+ "$");
    }
}
