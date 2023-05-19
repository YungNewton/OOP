package tim;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int pagesPrinted){
        this.tonerLevel = 100;
        this.duplex = true;
        this.pagesPrinted = pagesPrinted;
    }
    public int addToner(int tonerAmount){
        if (this.tonerLevel + tonerAmount >= 100){
            this.tonerLevel = 100;
            System.out.println("Toner level 100%");
        }else {
            this.tonerLevel = this.tonerLevel + tonerAmount;
            System.out.println("Toner level "+ this.tonerLevel+"%");
        }
        return this.tonerLevel;
    }

}
