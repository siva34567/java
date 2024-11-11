package Shapes;

import java.util.Scanner;

public class Triangle implements Shape {
    @Override
    public void printArea() {
        System.out.println("\nTriangle");
        System.out.println("---------\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base of Triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter Height of Triangle: ");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of the Triangle is: " + area);
    }
}
