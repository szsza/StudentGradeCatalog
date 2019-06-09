import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String[] materii = {"matematica", "romana", "fizica"};
        int[][] noteS1 = {{10, 9, 8}, {8,8,9}, {9,10,10}};
        Student s1 = new Student("Gigel", materii, noteS1);
        System.out.println(s1);
        int[][] noteS2 = {{4, 6, 5}, {4,2,5}, {3,5,7}};
        Student s2 = new Student("Bula", materii, noteS2);
        System.out.println(s2);
        s1.mediaAnuala();
        s2.mediaAnuala();


    }
}
