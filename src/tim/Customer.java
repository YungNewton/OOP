package tim;

public class Customer {
    private String name;
    private String emailAddress;
    private float creditLimit;

    public Customer(String name, String emailAddress, float creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public Customer() {
        this("Isaac", "isaacnewtonahanmisi@gmail.com",10000000000f);
    }

    public Customer(String name, String emailAddress) {
        this(name, emailAddress, 10000000);
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

}
