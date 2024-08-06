package coffeeapp.coffees;

public class Decaf extends Beverage {
    
    public Decaf() {
        super();
        this.description = "Decaf";
    }
    
    @Override
    public double cost() {
        double myReturn;
        if(this.size == Size.TALL) {
            myReturn = 1.05;
        } 
        else if(this.size == Size.GRANDE) {
            myReturn = 1.25;
        }
        else {
            myReturn = 1.35;
        }
        
        return myReturn;
    }
}
