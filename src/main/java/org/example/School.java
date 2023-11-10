package org.example;
import java.util.List;
import java.util.ArrayList;

public class School {
    List<Student> students= new ArrayList<>();

    public School(List<Student> students) {
        this.students = students;
    }
    public List<Student> addStudent(Student student){
        this.students.add(student);
        return this.students;
    }
    public void printAllStudents(List<Student> students){
        for (Student student:students
             ) {
            System.out.println(student.toString());

        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

    //findet einen Student anhand der id
    public Student findStudent(String matrikelNummer){
        for (Student student:students
             ) {
            if (student.getMatrikelNr().equals(matrikelNummer)){
                return student;
        }

        }
        return null;


    }
    //entfernt einen Student mit der matrikelNr aus der schule
    public List<Student> removeStudent(String matrikelNummer){
        Student remStudent=findStudent(matrikelNummer);
        if (remStudent!=null){
            this.students.remove(remStudent);


        } else {
            System.out.println("Student not found!");
        }
        return this.students;
    }

}
