import java.util.Scanner;

public class JavaControlFlowLevel1LabPractice {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {



    }

    // Q1. Check if number is divisible by 5
    public static void checkDivisibleByFive() {

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean result = number % 5 == 0;

        System.out.println("Is the number " + number +
                " divisible by 5? " + result);
    }

    // Q2. Check if first number is smallest
    public static void checkSmallestNumber() {

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        boolean result = num1 < num2 && num1 < num3;

        System.out.println("Is the first number the smallest? " + result);
    }

    // Q3. Check which number is largest
    public static void checkLargestNumber() {

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.println("Is the first number the largest? "
                + (num1 > num2 && num1 > num3));

        System.out.println("Is the second number the largest? "
                + (num2 > num1 && num2 > num3));

        System.out.println("Is the third number the largest? "
                + (num3 > num1 && num3 > num2));
    }

    // Q4. Sum of N Natural Numbers
    public static void sumOfNaturalNumbers() {

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {

            int sum = number * (number + 1) / 2;

            System.out.println("The sum of "
                    + number +
                    " natural numbers is "
                    + sum);

        } else {

            System.out.println("The number "
                    + number +
                    " is not a natural number");
        }
    }

    // Q5. Voting Eligibility
    public static void checkVotingEligibility() {

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {

            System.out.println("The person's age is "
                    + age +
                    " and can vote.");

        } else {

            System.out.println("The person's age is "
                    + age +
                    " and cannot vote.");
        }
    }

    // Q6. Positive Negative or Zero
    public static void checkNumberType() {

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number > 0) {

            System.out.println("Positive");

        } else if (number < 0) {

            System.out.println("Negative");

        } else {

            System.out.println("Zero");
        }
    }

    // Q7. Spring Season
    public static void springSeason() {

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        boolean isSpring =
                (month == 3 && day >= 20)
                        || (month == 4)
                        || (month == 5)
                        || (month == 6 && day <= 20);

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    // Q8. Rocket Countdown using While Loop
    public static void rocketCountdownWhile() {

        System.out.print("Enter countdown value: ");
        int counter = sc.nextInt();

        while (counter >= 1) {

            System.out.println(counter);
            counter--;
        }

        System.out.println("Rocket Launched!");
    }

    // Q9. Rocket Countdown using For Loop
    public static void rocketCountdownFor() {

        System.out.print("Enter countdown value: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {

            System.out.println(i);
        }

        System.out.println("Rocket Launched!");
    }
}