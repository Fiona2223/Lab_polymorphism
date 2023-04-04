public class Bread extends Grocery{
    private boolean wholemeal;

    public Bread(String name, int price, int size, int calorie) {
        super(name, price, size, calorie);

        this.wholemeal = wholemeal;
    }


    @Override
    public String setMaxPurchase(int amount) {
        return null;
    }

    @Override
    public void setMilkType() {
    }

    public boolean isWholemeal() {
        return true;
    }

    public void setWholemeal(boolean wholemeal) {
        this.wholemeal = wholemeal;
    }

    public String setAllergyWarning(){
        return "Caution Contains Gluten.";
    }

}
