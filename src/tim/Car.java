package tim;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.engine = true;
        this.wheels = 4;
        this.name = name;
        this.cylinders = cylinders;
    }
    public void startEngine(){
        System.out.println("Car -> startEngine()");
    }
    public void accelerate(){
        System.out.println("Car -> accelerate()");
    }
    public void brake(){
        System.out.println(this.getClass().getSimpleName()+" -> brake()");
    }
    public int getCylinders(){
        return this.cylinders;
    }
    public String getName(){
        return this.name;
    }
}
