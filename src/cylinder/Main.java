package cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("enter the value of Radius : ");
        double radius = Input.nextDouble();
        // object of parent class with set the value of constructor Circle
        Circle circle = new Circle(radius);
        System.out.println("circle.radius= " + circle.getRadius());  //get the value of radius
        System.out.println("circle.area= " + circle.getArea());      //get the area of circle
        System.out.print("enter the value of Radius : ");
        double radius1 = Input.nextDouble();
        System.out.print("enter the value of height : ");
        double height = Input.nextDouble();
        Cylinder cylinder = new Cylinder(radius1, height);     //object reference of Cylinder
        System.out.println("cylinder.radius= " + cylinder.getRadius());  //get the value of radius
        System.out.println("cylinder.height= " + cylinder.getHeight());  //get the value of height
        System.out.println("cylinder.area= " + cylinder.getArea());     //get the area of circle
        System.out.println("cylinder.volume= " + cylinder.getVolume());  //get the volume
    }
}
