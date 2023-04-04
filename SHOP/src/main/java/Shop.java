import java.util.ArrayList;

public class Shop {
    private String name;
    private double till;
    private ArrayList<Grocery> stock;


    public Shop(String name, double till, String stock) {
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public double stock_take(){
        double stockValue = 0;
        for (Grocery grocery : stock) {
            stockValue += grocery.getPrice();
        }
        return stockValue;
    }
    public double getTill() {
        return till;
    }
    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Grocery> getStock() {
        return stock;
    }

    public void addStock(ArrayList<Grocery> groceryItems) {
        this.stock = groceryItems;
    }

    public String canSellFood() {
        return ("Lunch meal deal");
    }

    public boolean canBuyLotteryTicket(){
        return false;
    }
}
