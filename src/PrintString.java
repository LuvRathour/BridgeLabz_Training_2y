
public class PrintString {
    public static void main(String[] args){
        String name = "ramm";
        print(name,0);
    }
    public static void print(String name,int index) {
        if (index == name.length()) {
            return;
        }
        System.out.print(name.charAt(index));
        print(name, index + 1);
    }
}
