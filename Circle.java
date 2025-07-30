public class Circle{
    private double radius;
    
    public Circle(){
        this.radius = 1.0;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nRadius: " + this.radius;
    }

    public String findRadius(){
        return "radius";
    }
}