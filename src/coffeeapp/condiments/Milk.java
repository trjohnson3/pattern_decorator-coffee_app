package coffeeapp.condiments;

import coffeeapp.coffees.Beverage;

public class Milk extends CondimentDecorator {
    
    public Milk(Beverage beverage) {
        super();
        this.beverage = beverage;
    }
    
    @Override
    public double cost() {
        double myReturn;
        if(this.size == Size.TALL) {
            myReturn = beverage.cost() + 0.1;
        } 
        else if(this.size == Size.GRANDE) {
            myReturn = beverage.cost() + 0.2;
        }
        else {
            myReturn = beverage.cost() + 0.3;
        }
        
        return myReturn;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
