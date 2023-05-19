public class Animal {
    private int brain;
    private boolean weight;
    private int size;
    private String name;

    public Animal(int brain, boolean weight, int size,String name) {
        this.brain = brain;
        this.weight = weight;
        this.size = size;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(){
        System.out.println("Animal is moving");
    }
    public void eat(){
        System.out.println(getName()+" is eating");
    }
}
