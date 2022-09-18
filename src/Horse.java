package enhörningInheritance.src;

public class Horse extends Animals {
   private String name;
    private int age;
    protected long animalId;
    protected int price;


    public Horse(String name, int age) {
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

    public void setAge(int age) {
        this.age = age;
    }
    public long getProductId() {
        return animalId;
    }

    public void setProductId(long productId) {
        this.animalId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void printHorseDetails() {
        System.out.println("AnimalId: " + this.animalId);
        System.out.println("This horse cost: " + this.price);
        System.out.println("This horse has a name and that is" + this.name);
        System.out.println("This horse is " + this.age + " years old.");
    }
}