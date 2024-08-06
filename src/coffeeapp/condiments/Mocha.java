package coffeeapp.condiments;

import coffeeapp.coffees.Beverage;

public class Mocha extends CondimentDecorator {
    
    public Mocha(Beverage beverage) {
        super();
        this.beverage = beverage;
    }
    
    @Override
    public double cost() {
        double myReturn;
        if(this.size == Size.TALL) {
            myReturn = beverage.cost() + 0.2;
        } 
        else if(this.size == Size.GRANDE) {
            myReturn = beverage.cost() + 0.3;
        }
        else {
            myReturn = beverage.cost() + 0.4;
        }
        
        return myReturn;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}