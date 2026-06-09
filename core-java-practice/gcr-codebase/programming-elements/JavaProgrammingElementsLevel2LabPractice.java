import java.util.Scanner;

public class JavaProgrammingElementsLevel2LabPractice {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        areaOfTriangle();
    }

    // Q1. Basic Calculator for Addition, Subtraction,
    // Multiplication and Division
    public static void basicCalculator() {

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println(
                "The addition, subtraction, multiplication and division value of 2 numbers "
                        + number1 + " and " + number2 + " is "
                        + addition + ", "
                        + subtraction + ", "
                        + multiplication + ", and "
                        + division);
    }

    // Q2. Area of Triangle in Square Inches and Square Centimeters
    public static void areaOfTriangle() {

        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;

        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println(
                "The Area of the triangle in sq in is "
                        + areaInches +
                        " and sq cm is "
                        + areaCm);
    }

    // Q3. Find Side of Square using Perimeter
    public static void sideOfSquare() {

        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println(
                "The length of the side is "
                        + side +
                        " whose perimeter is "
                        + perimeter);
    }

    // Q4. Convert Distance from Feet to Yards and Miles
    public static void distanceConverter() {

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println(
                "The distance in yards is "
                        + yards +
                        " while the distance in miles is "
                        + miles);
    }

    // Q5. Calculate Total Purchase Price
    public static void totalPurchasePrice() {

        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println(
                "The total purchase price is INR "
                        + totalPrice +
                        " if the quantity "
                        + quantity +
                        " and unit price is INR "
                        + unitPrice);
    }

    // Q6. Find Quotient and Remainder
    public static void quotientAndRemainder() {

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println(
                "The Quotient is "
                        + quotient +
                        " and Remainder is "
                        + remainder +
                        " of two numbers "
                        + number1 +
                        " and "
                        + number2);
    }

    // Q7. Integer Operations and Operator Precedence
    public static void intOperation() {

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.println(
                "The results of Int Operations are "
                        + result1 + ", "
                        + result2 + ", "
                        + result3 + ", "
                        + result4);
    }

    // Q8. Double Operations and Operator Precedence
    public static void doubleOperation() {

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println(
                "The results of Double Operations are "
                        + result1 + ", "
                        + result2 + ", "
                        + result3 + ", "
                        + result4);
    }
}