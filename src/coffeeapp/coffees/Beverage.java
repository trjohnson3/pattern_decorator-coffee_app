package coffeeapp.coffees;

public abstract class Beverage {
    
    protected String description = "Unknown Beverage";
    public enum Size {TALL, GRANDE, VENTI};
    protected Size size = Size.TALL;

    public String getDescription() {
        return size + " " + description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    public abstract double cost();
}
