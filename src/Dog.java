public class Dog extends Animal{
    private int legs;
    private String type;
    private int eyes;

    public Dog( int legs, String type, int eyes) {
        super(1, true, 1, "Dog");
        this.legs = legs;
        this.type = type;
        this.eyes = eyes;
    }

    @Override
    public void eat() {
        System.out.println("Dog chews");
        super.eat();
    }
}
