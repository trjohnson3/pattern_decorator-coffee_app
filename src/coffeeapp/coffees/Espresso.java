package coffeeapp.coffees;

public class Espresso extends Beverage {
    
    public Espresso() {
        super();
        this.description = "Espresso";
    }
    
    @Override
    public double cost() {
        return 1.99;
    }
}