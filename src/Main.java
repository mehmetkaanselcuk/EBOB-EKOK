import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, i = 1, ebob = 1;

        System.out.print("Enter the first number: ");
        n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        int min = (n1 < n2) ? n1 : n2;

        while (i <= min) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int ekok = (n1 * n2) / ebob;

        System.out.println("GCD (EBOB): " + ebob);
        System.out.println("LCM (EKOK): " + ekok);
    }
}
