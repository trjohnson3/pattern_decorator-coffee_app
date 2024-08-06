package coffeeapp.coffees;

public class HouseBlend extends Beverage {
    
    public HouseBlend() {
        super();
        this.description = "House Blend";
    }
    
    @Override
    public double cost() {
        double myReturn;
        if(this.size == Size.TALL) {
            myReturn = 0.89;
        } 
        else if(this.size == Size.GRANDE) {
            myReturn = 1.09;
        }
        else {
            myReturn = 1.19;
        }
        
        return myReturn;
    }
}
