package Shapes;

import java.util.Scanner;

public class Triangle extends Shape {
    double area = 0.0;

    @Override
    public void printArea() {
        System.out.println("\nTriangle");
        System.out.println("---------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base of Triangle: ");
        this.length = input.nextDouble();
        System.out.println("Enter Height of Triangle: ");
        this.height = input.nextDouble(); // Use 'height'
        this.area = 0.5 * this.length * this.height;
        System.out.println("Area of the Triangle is: " + this.area);
    }
}
