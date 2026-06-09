import java.util.Scanner;

public class JavaProgrammingElementsLevel1LabPractice {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        convertKmToMiles();
    }

    // Q1. Find Harry's Age
    public static void findHarryAge() {

        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is " + age);
    }

    // Q2. Average Percentage Mark in PCM
    public static void averagePCM() {

        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam's average mark in PCM is " + average);
    }

    // Q3. Convert Kilometer to Miles
    public static void convertKmToMiles() {

        double km = 10.8;
        double miles = km / 1.6;

        System.out.println("The distance " + km +
                " km in miles is " + miles);
    }

    // Q4. Profit and Profit Percentage
    public static void calculateProfitAndPercentage() {

        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println(
                "The Cost Price is INR " + costPrice +
                        " and Selling Price is INR " + sellingPrice +
                        "\nThe Profit is INR " + profit +
                        " and the Profit Percentage is "
                        + profitPercentage + "%");
    }

    // Q5. Pen Distribution
    public static void distributePens() {

        int pens = 14;
        int students = 3;

        int pensPerStudent = pens / students;
        int remainingPens = pens % students;

        System.out.println(
                "The Pen Per Student is "
                        + pensPerStudent +
                        " and the remaining pen not distributed is "
                        + remainingPens);
    }

    // Q6. University Fee Discount
    public static void calculateUniversityDiscount() {

        double fee = 125000;
        double discountPercent = 10;

        double discount = fee * discountPercent / 100;

        double finalFee = fee - discount;

        System.out.println(
                "The discount amount is INR "
                        + discount +
                        " and final discounted fee is INR "
                        + finalFee);
    }

    // Q7. Volume of Earth
    public static void calculateEarthVolume() {

        double radiusKm = 6378;

        double volumeKm = (4.0 / 3.0) * Math.PI *
                Math.pow(radiusKm, 3);

        double volumeMiles = volumeKm / Math.pow(1.6, 3);

        System.out.println(
                "The volume of earth in cubic kilometers is "
                        + volumeKm +
                        "\nThe volume of earth in cubic miles is "
                        + volumeMiles);
    }

    // Q8. Kilometer to Miles using User Input
    public static void convertKmToMilesInput() {

        System.out.print("Enter distance in km: ");
        double km = sc.nextDouble();

        double miles = km / 1.6;

        System.out.println(
                "The total miles is "
                        + miles +
                        " mile for the given "
                        + km +
                        " km");
    }

    // Q9. Fee Discount using User Input
    public static void calculateDiscountInput() {

        System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discountPercent = sc.nextDouble();

        double discount = fee * discountPercent / 100;

        double finalFee = fee - discount;

        System.out.println(
                "The discount amount is INR "
                        + discount +
                        " and final discounted fee is INR "
                        + finalFee);
    }

    // Q10. Height Conversion
    public static void convertHeight() {

        System.out.print("Enter height in cm: ");
        double cm = sc.nextDouble();

        double inches = cm / 2.54;
        double feet = inches / 12;

        System.out.println(
                "Your Height in cm is "
                        + cm +
                        " while in feet is "
                        + feet +
                        " and inches is "
                        + inches);
    }

    // Q11. Basic Calculator
    public static void basicCalculator() {

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;

        System.out.println(
                "The addition, subtraction, multiplication and division value of 2 numbers "
                        + num1 + " and " + num2 +
                        " is " +
                        addition + ", " +
                        subtraction + ", " +
                        multiplication + ", " +
                        division);
    }

    // Q12. Area of Triangle
    public static void triangleArea() {

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.println(
                "Area of Triangle = "
                        + area);
    }

    // Q13. Side of Square
    public static void squareSide() {

        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println(
                "The length of the side is "
                        + side +
                        " whose perimeter is "
                        + perimeter);
    }

    // Q14. Feet to Yards and Miles
    public static void convertFeetToYardsAndMiles() {

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println(
                "Distance in yards = "
                        + yards +
                        " and miles = "
                        + miles);
    }

    // Q15. Total Purchase Price
    public static void calculatePurchasePrice() {

        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println(
                "The total purchase price is INR " + totalPrice +" if the quantity "+ quantity + " and unit price is INR "+ unitPrice);
    }

    // Q16. Maximum Number of Handshakes
    public static void calculateHandshakes() {

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents *
                (numberOfStudents - 1)) / 2;

        System.out.println("Maximum possible handshakes = "+ handshakes);
    }
}