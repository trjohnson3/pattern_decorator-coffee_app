package coffeeapp.condiments;

import coffeeapp.coffees.Beverage;

public abstract class CondimentDecorator extends Beverage {
    
    protected Beverage beverage;
    
    @Override
    public abstract String getDescription();
}
