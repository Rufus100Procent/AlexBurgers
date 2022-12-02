package se.jensen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Welcame to the wizard Burger");

        Iteam souce1 = new Topping("chili sauce", 0.1);
        Iteam souce2 = new Topping("mayonnaise", 0.1);
        Burger spacialBUrger = new Burger("Heaven Burger", 10);
        spacialBUrger.setTopping(souce1, souce2);

        Iteam drink = new Drink("Vodka ", 3);
        Iteam fries = new SideDish("Heaven Burger round2", 0);

        Meal limitedAddition_Meal = new Meal(spacialBUrger, drink, fries);


        System.out.println();

        //////////////

        DeluxBurger deluxeBurger = new DeluxBurger("Dellie", 6);
        deluxeBurger.setTopping(souce1, souce2);
        deluxeBurger.printExtras();

        Iteam drinks = new Drink("pepsi", 1);
        Iteam sideDish2 = new SideDish("Tacos", 2);
        DeluxBurger deluxeMeal = new DeluxBurger(deluxeBurger, drinks, sideDish2);




         PrintMenue();
        boolean again = false;
        while (again == false) {

            try {
                Scanner scanner = new Scanner(System.in);

                int input;
                input = scanner.nextInt();

                switch (input) {
                    case 1:
                        limitedAddition_Meal.printMeal();
                        System.out.println();
                        deluxeMeal.printIteam();
                        ChoseMenue();
                        break;
                    case 2:
                        System.out.println("your total is 13.2 $");
                        again = true;
                        break;
                    case 3:
                        System.out.println("TOTAL PRICE: 10.2");
                        again = true;
                        break;
                    case 4:
                        again = true;
                        System.out.println("BYe!!");
                        break;
                    default:
                        System.out.println("chose the number from 1 - 4");
                        PrintMenue();
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid input!!, TRY AGAIN");

               PrintMenue();
            }
        }
    }
    public static void ChoseMenue() {

        System.out.println("" +
                "2. Get Meal 1\n" +
                "3. Get Meal 2\n" +
                "4. Exit\n");
    }
    public static void PrintMenue(){
        System.out.println("you have 3 option to chose from");
        System.out.println("1. if you want to look the Menue");
        ChoseMenue();
    }

}
