package coffeeapp.coffees;

public class Decaf extends Beverage {
    
    public Decaf() {
        super();
        this.description = "Decaf";
    }
    
    @Override
    public double cost() {
        return 1.05;
    }
}
