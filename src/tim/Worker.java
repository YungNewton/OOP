package tim;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }
    public int getAge(){
        return 0;
    }
    public double collectPay(){
        return 0;
    }
    public void terminate(){

    }
}
