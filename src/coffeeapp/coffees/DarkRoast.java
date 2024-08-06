package coffeeapp.coffees;

public class DarkRoast extends Beverage {
    
    public DarkRoast() {
        super();
        this.description = "Dark Roast";
    }
    
    @Override
    public double cost() {
        double myReturn;
        if(this.size == Size.TALL) {
            myReturn = 0.99;
        } 
        else if(this.size == Size.GRANDE) {
            myReturn = 1.19;
        }
        else {
            myReturn = 1.29;
        }
        
        return myReturn;
    }
}
