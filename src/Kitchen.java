public class Kitchen {
    private int pots;
    private String food;
    private int faucet;

    public Kitchen(int pots, String food, int faucet) {
        this.pots = pots;
        this.food = food;
        this.faucet = faucet;
    }

    public int getPots() {
        return pots;
    }

    public String getFood() {
        return food;
    }

    public int getFaucet() {
        return faucet;
    }
    public void isCooking(boolean is){
        if (is) {
            System.out.println("someone is cooking");
        } else {
            System.out.println("nobody is cooking");
        }
    }
}
