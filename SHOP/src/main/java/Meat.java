public class Meat extends Grocery {
    private boolean vegan;

    public Meat(String name, int price, int size, int calorie, boolean vegan) {
        super(name, price, size, calorie);

        this.vegan = vegan;

    }

    @Override
    public String setMaxPurchase(int amount) {
        return null;
    }

    @Override
    public void setMilkType() {

    }

    public boolean isVegan() {
        return false;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    enum MeatFat {
        HIGH, LOW;

        public String checkMeatFat() {
            MeatFat high = MeatFat.HIGH;
            return new String("T-Bone Steak");
        }


    }
}
