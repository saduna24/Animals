public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, AnimalType type, String habitat, String breed) {
        super(name, age, type, habitat);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woooof!");
    }
}

public class Parrot extends Animal implements Pet, Bird {
    private String color;

    public Parrot(String name, int age, AnimalType type, String habitat, String color) {
        super(name, age, type, habitat);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println("The parrot is playing");
    }

    @Override
    public void fly() {
        System.out.println("The parrot is flying.");
    }
}

public interface Pet {
    void playWith();
}

public interface Bird {
    void fly();
}
}
