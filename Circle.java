package javaapplication1;

public class Circle extends Shape {
    
    private double raduis;

    // override the abstract to prevent errors
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.raduis, 2);
    }

    @Override
    public double getPeremiter() {
        return 2 * Math.PI * this.raduis;
    }

    @Override
    public String HowToDraw() {
        return "This is circle";
    }
    
    // constractors
    public Circle(double raduis) {
        super(); // could be deleted
        this.raduis = raduis;
    }

    public Circle(double raduis, String Color) {
        super(Color);
        this.raduis = raduis;
    }
    
    // methods (setters , getters , tostring)
    public void setRaduis(double r) {
        this.raduis = r;
    }
    
    public double getRaduis() {
        return raduis;
    }
    
    @Override
    public String toString() {
        return "Circle{" + "Color = " + super.getColor() + "  Date = " + super.getDateCreated() + "  raduis = " + raduis + '}';
    }
    
}
