package coffeeapp.coffees;

public class HouseBlend extends Beverage {
    
    public HouseBlend() {
        super();
        this.description = "House Blend";
    }
    
    @Override
    public double cost() {
        return 0.89;
    }
}
