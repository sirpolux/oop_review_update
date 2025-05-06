package comparables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
        Student james = new Student("James", 32);
        Student peter = new Student ("Peter", 19);
        Student ugo = new Student("Ugo", 24);
        Student miracle = new Student("Miracle", 26);
        Student ij = new Student("Ij", 27);

        Integer totalAge = 0;

        Student[] students = {james, peter, ugo, miracle, ij};
       // System.out.println(Arrays.toString(students));
        System.out.println();

        Arrays.sort(students);
        //System.out.println(Arrays.toString(students));

        List<Student> studentLists = new ArrayList<>(List.of(james,peter,ugo,miracle,ij));

        studentLists.forEach((student -> System.out.println(student.getName())));

        Consumer<Student> info = (stud)-> System.out.println(stud.getName());
        studentLists.forEach(info);

        Sum sum = Integer::sum;  //lambda, replaced with method reference
        //Sum sum = (a,b)->a+b;


    }

}


@FunctionalInterface
 interface  Sum{
    int sum(int a, int b);

}