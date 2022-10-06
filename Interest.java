import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money, interestRate;
        int month;

        System.out.print("Enter money: ");
        money = scanner.nextDouble();

        System.out.print("Enter month: ");
        month = scanner.nextInt();

        System.out.print("Enter interest rate: ");
        interestRate = scanner.nextDouble();

        double totalInterest = 0;

        for (int i = 0; i < month ; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }

        System.out.println(totalInterest);
    }
}
