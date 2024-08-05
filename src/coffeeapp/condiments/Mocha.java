package coffeeapp.condiments;

import coffeeapp.coffees.Beverage;

public class Mocha extends CondimentDecorator {
    
    public Mocha(Beverage beverage) {
        super();
        this.beverage = beverage;
    }
    
    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}