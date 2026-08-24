public class Binsearch {

    public static int search(int[] arr, int n, int target) {
        if (n >= arr.length) {
            return -1;
        }

        if (arr[n] == target) {
            return n;
        }

        return search(arr, n + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 78};
        int target = 5;

        System.out.println(search(arr, 0, target));
    }
}