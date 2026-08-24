
public class Printnum {
    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printInc(n -1);
    }

    public static void main(String args[]) {
        printInc(10);
    }
}
