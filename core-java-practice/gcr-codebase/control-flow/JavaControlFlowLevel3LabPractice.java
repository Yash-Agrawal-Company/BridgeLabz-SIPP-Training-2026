import java.util.Scanner;

public class JavaControlFlowLevel3LabPractice {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Uncomment any function to execute

        // leapYearUsingIfElse();
        // leapYearUsingSingleCondition();
        // calculateGrade();
        // checkPrimeNumber();
        // checkArmstrongNumber();
        // countDigits();
        // calculateBMI();
        // checkHarshadNumber();
        // checkAbundantNumber();
        // calculatorUsingSwitch();
        // dayOfWeekCalculator();
    }

    // Q1. Leap Year using Multiple If Else
    public static void leapYearUsingIfElse() {

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid Gregorian Year");
        }
        else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year");
        }
        else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        else {
            System.out.println(year + " is not a Leap Year");
        }
    }

    // Q2. Leap Year using Single Condition
    public static void leapYearUsingSingleCondition() {

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if (year >= 1582 &&
                ((year % 4 == 0 && year % 100 != 0)
                        || year % 400 == 0)) {

            System.out.println(year + " is a Leap Year");
        }
        else {
            System.out.println(year + " is not a Leap Year");
        }
    }

    // Q3. Percentage, Grade and Remarks
    public static void calculateGrade() {

        System.out.print("Enter Physics Marks: ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry Marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Maths Marks: ");
        double maths = sc.nextDouble();

        double percentage =
                (physics + chemistry + maths) / 3;

        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        }
        else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        }
        else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching standards";
        }
        else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below standards";
        }
        else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below standards";
        }
        else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);
    }

    // Q4. Prime Number Check
    public static void checkPrimeNumber() {

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
    }

    // Q5. Armstrong Number
    public static void checkArmstrongNumber() {

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {

            int digit = originalNumber % 10;

            sum += digit * digit * digit;

            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        }
        else {
            System.out.println(number + " is not an Armstrong Number");
        }
    }

    // Q6. Count Digits
    public static void countDigits() {

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int count = 0;

        int temp = Math.abs(number);

        while (temp != 0) {

            count++;

            temp /= 10;
        }

        if (number == 0) {
            count = 1;
        }

        System.out.println("Number of Digits = " + count);
    }

    // Q7. BMI Calculator
    public static void calculateBMI() {

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter Height (cm): ");
        double heightCm = sc.nextDouble();

        double heightMeter = heightCm / 100;

        double bmi =
                weight /
                        (heightMeter * heightMeter);

        System.out.println("BMI = " + bmi);

        if (bmi <= 18.4) {
            System.out.println("Status = Underweight");
        }
        else if (bmi <= 24.9) {
            System.out.println("Status = Normal");
        }
        else if (bmi <= 39.9) {
            System.out.println("Status = Overweight");
        }
        else {
            System.out.println("Status = Obese");
        }
    }

    // Q8. Harshad Number
    public static void checkHarshadNumber() {

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int temp = number;
        int sum = 0;

        while (temp != 0) {

            sum += temp % 10;

            temp /= 10;
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        }
        else {
            System.out.println(number + " is not a Harshad Number");
        }
    }

    // Q9. Abundant Number
    public static void checkAbundantNumber() {

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        }
        else {
            System.out.println(number + " is not an Abundant Number");
        }
    }

    // Q10. Calculator using Switch Case
    public static void calculatorUsingSwitch() {

        System.out.print("Enter First Number: ");
        double first = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double second = sc.nextDouble();

        System.out.print("Enter Operator (+,-,*,/): ");
        String op = sc.next();

        switch (op) {

            case "+":
                System.out.println("Result = " +
                        (first + second));
                break;

            case "-":
                System.out.println("Result = " +
                        (first - second));
                break;

            case "*":
                System.out.println("Result = " +
                        (first * second));
                break;

            case "/":
                System.out.println("Result = " +
                        (first / second));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }

    // Q11. Day Of Week Calculator
    public static void dayOfWeekCalculator() {

        System.out.print("Enter Month: ");
        int m = sc.nextInt();

        System.out.print("Enter Day: ");
        int d = sc.nextInt();

        System.out.print("Enter Year: ");
        int y = sc.nextInt();

        int y0 = y - (14 - m) / 12;

        int x = y0 + y0 / 4
                - y0 / 100
                + y0 / 400;

        int m0 = m
                + 12 * ((14 - m) / 12)
                - 2;

        int d0 =
                (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of Week = " + d0);

        System.out.println(
                "0=Sunday, 1=Monday, 2=Tuesday, "
                        + "3=Wednesday, 4=Thursday, "
                        + "5=Friday, 6=Saturday");
    }
}