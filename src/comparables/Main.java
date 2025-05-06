package comparables;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Student james = new Student("James", 32);
        Student peter = new Student ("Peter", 19);
        Student ugo = new Student("Ugo", 24);
        Student miracle = new Student("Miracle", 26);
        Student ij = new Student("Ij", 27);

        Student[] students = {james, peter, ugo, miracle, ij};
        System.out.println(Arrays.toString(students));
        System.out.println();

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


    }

}
