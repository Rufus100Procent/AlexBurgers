package se.jensen;

public class Burger  extends Iteam{

    private Iteam topping1;
    private Iteam topping2;
    private Iteam dtopping2;
    private Iteam tdtopping2;

    public Burger(String spacialburger, int price) {
        super();
    }

    public Burger(DeluxBurger deluxeBurger, Iteam drinks, Iteam sideDish2) {

    }


    @Override
    public String getName() {
        return super.getName() + "Burger";

    }

    public double getTotalPrice( ){

        return getBasePrice() + 0.2;

    }

    public void setTopping(Iteam topping1 , Iteam topping2) {
        this.topping1 = topping1;
        this.topping2 = topping2;

    }

    protected void printToppings(){


    }

    @Override
    public void printIteam() {
        super.printIteam();
    }
}
