public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1,true,1,"Animal");
        Dog dog = new Dog(4,"German shepherd",2);
        dog.eat();
        SelfCon selfCon = new SelfCon(new Kitchen(1,"rice",2),new Parlour(1,6));
        selfCon.getKitchen().isCooking(true);
    }
}
