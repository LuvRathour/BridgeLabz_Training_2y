package Linklist;

public class student {
    String name;
    public student(String name){
        this.name=name;
    }

    static void main(String args[]) {
        student s1 = new student("Luv");
        System.out.println(s1.name);
    }
}
