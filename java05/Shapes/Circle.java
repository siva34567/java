package Shapes;

import java.util.Scanner;

public class Circle implements Shape {
    @Override
    public void printArea() {
        System.out.println("\nCircle");
        System.out.println("-------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle is: " + area);
    }
}
