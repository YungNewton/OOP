package tim;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(long employeeId, String hireDate, double hourlyPayRate) {
        super(employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {
        System.out.println("Your request for a double pay is successful");
        this.hourlyPayRate = this.hourlyPayRate * 2;
        System.out.println("your new hourly pay rate is " + hourlyPayRate);
    }
}
