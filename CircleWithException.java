package Lab8_Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleWithException {

    private static double radius;

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double inputRadius) {
        if (inputRadius < 0) {
            throw new IllegalArgumentException("Please input a positive number!");
        } else {
            radius = inputRadius;
        }
    }

    public static double getArea() throws Exception {
        double area = radius * radius * Math.PI;
        if (area > 1000) {
            throw new Exception("Area is bigger than 1000!");
        } else {
            return area;
        }
    }

    public static double getDiameter() {
        return radius * Math.PI * 2;
    }

    public static void main(String[] args) {
        boolean check = false;
        double area = 0;
        double diameter = 0;
        while (!check) {
            try {
                System.out.print("Enter Radius: ");
                Scanner in = new Scanner(System.in);
                setRadius(in.nextDouble());

                area = getArea();
                diameter = getDiameter();
                check = true;
            } catch (InputMismatchException ime) {
                System.out.println("Please input a number!");
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("The area is: " + area);
        System.out.println("The diameter is: " + diameter);
    }
}
