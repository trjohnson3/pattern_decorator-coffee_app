package coffeeapp.coffees;

public class DarkRoast extends Beverage {
    
    public DarkRoast() {
        super();
        this.description = "Dark Roast";
    }
    
    @Override
    public double cost() {
        return 0.99;
    }
}
