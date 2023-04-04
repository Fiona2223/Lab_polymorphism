import Interface.IMilk;

public abstract class Grocery implements IMilk {


    protected String name;
    protected double price;
    protected int size;
    protected int calorie;
    protected int ItemInformation;


    public Grocery(String name, int price, int size, int calorie){
        this.name = name;
        this.price = price;
        this.size = size;
        this.calorie = calorie;
    }

    public int getItemInformation(Grocery item1){
        return this.ItemInformation;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }


    public abstract String setMaxPurchase(int amount);


    public abstract void setMilkType();

    public static class Bread {
    }
}
