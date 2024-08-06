package coffeeapp.coffees;

public class Espresso extends Beverage {
    
    public Espresso() {
        super();
        this.description = "Espresso";
    }
    
    @Override
    public double cost() {
        double myReturn;
        if(this.size == Size.TALL) {
            myReturn = 1.99;
        } 
        else if(this.size == Size.GRANDE) {
            myReturn = 2.19;
        }
        else {
            myReturn = 2.29;
        }
        
        return myReturn;
    }
}