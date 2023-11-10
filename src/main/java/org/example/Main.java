package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        /*
        List<Object> fruits=new ArrayList<>();
        fruits.add("Banane");
        fruits.add("Apfel");
        fruits.add("Birne");
        System.out.println(fruits.size());
        String text=fruits.get(2).toString();

        System.out.println("Hello world!"+text);*/
/*Erstelle eine Java List für Elemente des Typs "Student"
und füge mehrere Studenten hinzu.
 */
        List<Student> studenten = new ArrayList<>();
        studenten.add(new Student("Luci","Hoekfens","12345"));
        studenten.add(new Student("Emi","Hoekfens","23456"));
        studenten.add(new Student("Karl","Hoekfens","34567"));

        System.out.println(studenten.toString());
        School schule= new School(studenten);
        schule.printAllStudents(studenten);
        System.out.println(schule.toString());
        //finde student "12345" in der schule
        System.out.println("finde den Studenten mit der Matrikelnummer 1234: "+schule.findStudent("12345"));
        // entferne student "12345" aus der schule
        System.out.println("entferne Studenten mit der Matrikelnummer 1234: "+schule.removeStudent("12345"));
    }
}