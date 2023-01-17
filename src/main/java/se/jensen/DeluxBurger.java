package se.jensen;

public class DeluxBurger extends Burger{


    public DeluxBurger(String spacialburger, int price) {
        super(spacialburger, price);
    }

    private Iteam extra;
    private Iteam dextra;

    public DeluxBurger(DeluxBurger deluxeBurger, Iteam drinks, Iteam sideDish2) {
        super(deluxeBurger, drinks, sideDish2);
    }


    @Override
    public double getTotalPrice() {
        return super.getTotalPrice() + 0.1;
    }


    public void printIteam() {

        System.out.println("---- MEAL 2 ----\n" +
                "Dellie Burger ... 6.0\n" +
                "Cocktail Sauce ... 0.1\n" +
                "mayonnaise Topping ... 0.4\n" +
                "pepsi Drink ... 1.0\n" +
                "Tacos Side Dish ... 2.5\n");

    }

    protected void printExtras(){
        Iteam extraSouce = new Topping("Cocktail Sauce", 0.1);
        setExtra(extraSouce);

    }

    public void setExtra(Iteam extra) {
        this.extra = extra;
    }
}
