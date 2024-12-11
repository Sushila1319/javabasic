package collectionframeworks.collectionframework;

import java.util.HashMap;

public class StudentModel {

    public void studentList(){

        HashMap<String, String> studentList = new HashMap<> () ;

        studentList.put("Name of student 1", "John Doe");
        studentList.put("Name of student 2","Mike Jose" );
        studentList.put("Name of Student 3", "Bella Santiago");

        System.out.println("Student List: ");
        System.out.println("Student 1: " + studentList.get("John Doe"));

        HashMap<String, Character> studentSection = new HashMap<>();

        studentSection.put("Section of student 1", 'A');
        studentSection.put("Section of student 2", 'B');
        studentSection.put("Section of student 3", 'A');

        HashMap<String, Integer> studentRollNumber = new HashMap<>();

        studentRollNumber.put("Roll no of student 1", 1);
        studentRollNumber.put("Roll no of student 2", 7);
        studentRollNumber.put("Roll no of student 3", 3);



        System.out.println("Section: " + studentSection.get('A'));



    }
}
