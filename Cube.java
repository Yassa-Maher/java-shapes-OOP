package javaapplication1;

public class Cube extends ThreeDShape{

    private double side;

    public Cube() {
    }

    public Cube(double side) {
        this.side = side;
    }

    
    public Cube(double side, String Color) {
        super(Color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Cube{" + "side = " + side + '}';
    }
    
    public void setSide(double s){
        this.side = s;
    }
    
    public double getSide(){
        return side;
    }
    
    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double getPeremiter() {
        return this.side * 12;
    }

    @Override
    public String HowToDraw() {
        return "This is cube";
    }
    
}
