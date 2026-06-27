package javaapplication1;

import java.util.Date;

public abstract class Shape implements Drawable {    // ineritance from instance 
    
    private Date dateCreated;
    private String Color;

    public Shape() {
    }

    public Shape(String Color) {
        this.Color = Color;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    
    
    
    
    public abstract double getArea();
    public abstract double getPeremiter();
    
}
