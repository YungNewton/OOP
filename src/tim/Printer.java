package tim;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer(int tonerLevel, boolean duplex){
        if (tonerLevel>-1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0&&tonerAmount<=100&&this.tonerLevel +tonerAmount <=100){
            this.tonerLevel = this.tonerLevel + tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            if (pages==1){
                pagesToPrint = 1;
            }
            if(pages%2==0){
                pagesToPrint = pages/2;
            }else{
                pagesToPrint = pages/2 +1;
            }
        }else{
            pagesToPrint = pages;
        }
        this.pagesPrinted = this.pagesPrinted + pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}
