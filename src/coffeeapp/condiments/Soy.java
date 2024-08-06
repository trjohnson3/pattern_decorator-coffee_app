package coffeeapp.condiments;

import coffeeapp.coffees.Beverage;

public class Soy extends CondimentDecorator {
    
    public Soy(Beverage beverage) {
        super();
        this.beverage = beverage;
    }
    
    @Override
    public double cost() {
        double myReturn;
        if(this.size == Size.TALL) {
            myReturn = beverage.cost() + 0.15;
        } 
        else if(this.size == Size.GRANDE) {
            myReturn = beverage.cost() + 0.25;
        }
        else {
            myReturn = beverage.cost() + 0.35;
        }
        
        return myReturn;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}