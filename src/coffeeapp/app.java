package coffeeapp;

import coffeeapp.coffees.Beverage;
import coffeeapp.coffees.DarkRoast;
import coffeeapp.coffees.Espresso;
import coffeeapp.coffees.HouseBlend;
import coffeeapp.condiments.Mocha;
import coffeeapp.condiments.Soy;

public class app {

    public static void main(String[] args) {
        
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $"
            + beverage1.cost());
        
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $"
            + beverage2.cost());
        
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() + " $"
            + beverage3.cost());        
    }
    
}
