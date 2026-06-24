
public class RaviAnnualBonus{
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 25;
        String rank = "Junior Developer";
        double salary = 50000.0;
        float membershipFee = 150.75f;
        double annualBonus = salary * 0.12;
        int annualBonusInt = (int) annualBonus;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: " + salary);
        System.out.println("Membership Fee: " + membershipFee);
        System.out.println("Annual Bonus: " + annualBonus);
        System.out.println("Annual Bonus (int): " + annualBonusInt);
    }
}