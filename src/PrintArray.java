import java.sql.SQLOutput;

public class PrintArray {
    public static void printDec(int arr[], int index){
        if (index == arr.length) {
            return;
        }
        printDec(arr,index+1);
        System.out.print(arr[index]);
    }

   public static void main() {
        int arr [] = {1,2,3,4,5,6,7};
        printDec(arr,0);
    }
}
