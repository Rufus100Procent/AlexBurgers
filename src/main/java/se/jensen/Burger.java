package se.jensen;

public class Burger  extends Iteam{

    private Iteam topping1;
    private Iteam topping2;

    public Burger(String spacialburger, int price) {
        super();
    }

    public Burger(DeluxBurger deluxeBurger, Iteam drinks, Iteam sideDish2) {

    }


    @Override
    public String getName() {
        return super.getName();
    }

    public double getTotalPrice(){
        return 0.0;
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