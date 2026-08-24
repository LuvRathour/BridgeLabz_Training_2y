import java.util.Scanner;

public class gcd {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(findGCD(num1, num2));
    }
}


