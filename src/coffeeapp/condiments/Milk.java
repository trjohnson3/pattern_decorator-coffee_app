package coffeeapp.condiments;

import coffeeapp.coffees.Beverage;

public class Milk extends CondimentDecorator {
    
    public Milk(Beverage beverage) {
        super();
        this.beverage = beverage;
    }
    
    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
