import java.util.Scanner;

public class JavaControlFlowLevel2LabPractice {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

     
    }

    // Q1. Print Odd and Even Numbers
    public static void printOddEvenNumbers() {

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
    }

    // Q2. Employee Bonus
    public static void employeeBonus() {

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0;

        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus Amount = " + bonus);
    }

    // Q3. Multiplication Table from 6 to 9
    public static void multiplicationTable() {

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 6; i <= 9; i++) {

            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    // Q4. FizzBuzz using For Loop
    public static void fizzBuzzForLoop() {

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    // Q5. FizzBuzz using While Loop
    public static void fizzBuzzWhileLoop() {

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int i = 1;

        while (i <= number) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

            i++;
        }
    }

    // Q6. Youngest and Tallest Friend
    public static void youngestAndTallestFriend() {

        System.out.print("Enter Amar Age: ");
        int amarAge = sc.nextInt();

        System.out.print("Enter Akbar Age: ");
        int akbarAge = sc.nextInt();

        System.out.print("Enter Anthony Age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Amar Height: ");
        double amarHeight = sc.nextDouble();

        System.out.print("Enter Akbar Height: ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter Anthony Height: ");
        double anthonyHeight = sc.nextDouble();

        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Youngest Friend: Amar");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Youngest Friend: Akbar");
        } else {
            System.out.println("Youngest Friend: Anthony");
        }

        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Tallest Friend: Amar");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Tallest Friend: Akbar");
        } else {
            System.out.println("Tallest Friend: Anthony");
        }
    }

    // Q7. Factors using For Loop
    public static void factorsUsingForLoop() {

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Factors are:");

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    // Q8. Factors using While Loop
    public static void factorsUsingWhileLoop() {

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int counter = 1;

        while (counter < number) {

            if (number % counter == 0) {
                System.out.println(counter);
            }

            counter++;
        }
    }

    // Q9. Greatest Factor using For Loop
    public static void greatestFactorForLoop() {

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {

            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest Factor = " + greatestFactor);
    }

    // Q10. Greatest Factor using While Loop
    public static void greatestFactorWhileLoop() {

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;
        int counter = number - 1;

        while (counter >= 1) {

            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }

            counter--;
        }

        System.out.println("Greatest Factor = " + greatestFactor);
    }

    // Q11. Multiples Below 100 using For Loop
    public static void multiplesBelowHundredForLoop() {

        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid Input");
            return;
        }

        for (int i = number; i < 100; i += number) {
            System.out.println(i);
        }
    }

    // Q12. Power using For Loop
    public static void powerUsingForLoop() {

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println("Result = " + result);
    }

    // Q13. Multiples Below 100 using While Loop
    public static void multiplesBelowHundredWhileLoop() {

        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid Input");
            return;
        }

        int multiple = number;

        while (multiple < 100) {

            System.out.println(multiple);

            multiple += number;
        }
    }

    // Q14. Power using While Loop
    public static void powerUsingWhileLoop() {

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        while (counter < power) {

            result *= number;
            counter++;
        }

        System.out.println("Result = " + result);
    }
}