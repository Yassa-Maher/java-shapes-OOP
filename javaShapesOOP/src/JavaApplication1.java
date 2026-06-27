package javaapplication1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class JavaApplication1 {

    private static boolean isPositiveInteger(String s) {
        return s.matches("\\d+") && Integer.parseInt(s) > 0;
    }

    private static boolean isPositiveNumber(String s) {
        try {
            return Double.parseDouble(s.trim()) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
       
        double sum = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose input method:");
        System.out.println("1 - From file");
        System.out.println("2 - From command line arguments");
        System.out.println("3 - Using GUI");
        
        int choice = sc.nextInt();
        
        if(choice == 1){
        
        // read input file
        File file = null;
        Scanner jin = null;
        
        try {
            file = new File("input.txt");
            jin = new Scanner(file);
            String s = jin.next();
            
        
            
        
            int n = Integer.parseInt(s);
            Drawable arr[] = new Drawable[n];
            
            for(int i=0 ; i<n ; i++){
                
                String type = jin.next();
                String ss = jin.next();
            
                
        
                double lenth = Double.parseDouble(ss);
        
                type = type.toLowerCase();
                switch(type){
                    case "circle" : 
                        arr[i] = new Circle(lenth);
                        sum += ((Circle)arr[i]).getArea();
                        break;
                    
                    case "cube" : 
                        arr[i] = new Cube(lenth);
                        sum += ((Cube)arr[i]).getArea();
                        break;
                    
                    default :
                        System.out.println("Invalid shape type: " + type);
                        return;
                }
            }
        } 
        catch (Exception e){
            System.out.println("Bugs Won!");
        }
        finally {
            if(jin != null) jin.close();
        }
        
        // write to file
        FileWriter fw = null;
        PrintWriter pw = null;
        
        try {
            fw = new FileWriter("output.txt");
            pw = new PrintWriter(fw);
            pw.println("Sum of shapes: " + sum);
        }
        catch (Exception e){
            System.out.println("Bugs Won!");
        }
        finally{
           if(pw != null) pw.close();
        }
        
        }
        
        
        
        else if (choice == 2){
        
        if (args.length < 1 || !isPositiveInteger(args[0])) {
            System.out.println("put positive number !");
            return; 
        }
        
        String s = args[0];
        
        int n = Integer.parseInt(s);
        Drawable [] arr = new Drawable [n];
       
        for (int i=0 ; i<n ; i++) {
            String type = args[i*2+1];
            String ss = args[i*2+2];
            
            if (!isPositiveNumber(ss)) {
                System.out.println("put positive number !");
                return; 
            }
            
            double lenth = Double.parseDouble(ss);
            
            type = type.toLowerCase();
            switch(type) {
                case "circle" -> {
                    arr[i] = new Circle(lenth);
                    sum += ((Circle)arr[i]).getArea();
                }
                    
                case "cube" -> {
                    arr[i] = new Cube(lenth);
                    sum += ((Cube)arr[i]).getArea();
                }
                
                default -> {
                    System.out.println("Invalid shape type: " + type);
                    return;
                }
            }
        }
        }
        
        else if (choice == 3){
        // GUI
        java.awt.EventQueue.invokeLater(() -> new JFrame().setVisible(true));
        }
        else {
            System.out.println("InValid Choice");
        }
        if (choice != 3) {
            System.out.println("Sum of shapes: " + sum);
        }
    }
    
}
