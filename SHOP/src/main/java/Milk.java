public class Milk extends Grocery {
    private String milkType;
    private boolean vegan;

    public Milk(String name, int price, int size, int calorie) {
        super(name, price, size, calorie);
        this.milkType = milkType;
        this.vegan = vegan;
    }


    public String setMaxPurchase(int amount) {
        return String.format("Maximum purchase is " + amount);
    }

    public String setExpirationDate(int date){
        return String.format("Best by " + date);
    }



    @Override
    public void setMilkType(){
        this.milkType = milkType;
    }

}
