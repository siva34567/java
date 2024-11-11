package Shapes;

import java.util.Scanner;

public class Rectangle implements Shape {
    @Override
    public void printArea() {
        System.out.println("\nRectangle");
        System.out.println("---------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter Breadth of Rectangle: ");
        double height = input.nextDouble();
        double area = length * height;
        System.out.println("Area of the Rectangle is: " + area);
    }
}
