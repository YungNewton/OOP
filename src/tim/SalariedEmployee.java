package tim;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        if(!isRetired){
            System.out.println("By retiring, You are now relieved of your duties");
            this.isRetired = true;
        }else {
            System.out.println("you are already Retired");
        }
    }
}
