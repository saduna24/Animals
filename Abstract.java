abstract class Animal {
    private String name;
    private int age;
    private AnimalType type;
    private String habitat;

    public Animal(String name, int age, AnimalType type, String habitat) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.habitat = habitat;
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

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
