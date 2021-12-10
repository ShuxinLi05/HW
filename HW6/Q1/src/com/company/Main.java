package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {

        List<Student> students = new LinkedList<>();

        Student Amy = new Student(1001,"Amy", 3.5,
                new SimpleDateFormat("yyyy-MM-dd").parse("1994-05-20"));

        Student Ben = new Student(1002,"Ben", 3.7,
                new SimpleDateFormat("yyyy-MM-dd").parse("1996-03-03"));

        Student Charles = new Student(1003,"Charles", 3.2,
                new SimpleDateFormat("yyyy-MM-dd").parse("1999-01-18"));

        Student Daniel = new Student(1004,"Daniel", 2.9,
                new SimpleDateFormat("yyyy-MM-dd").parse("2000-08-15"));

        Student Ellen = new Student(1005,"Ellen", 3.3,
                new SimpleDateFormat("yyyy-MM-dd").parse("1998-10-11"));

        students.add(Amy);
        students.add(Ben);
        students.add(Charles);
        students.add(Daniel);
        students.add(Ellen);

        System.out.println("Sort by ascending order of name:");
        students.sort(new NameComparator());
        System.out.println(students);

        System.out.println("Sort by descending order of gpa:");
        students.sort(new GpaComparator());
        System.out.println(students);

        System.out.println("Sort by ascending order of dateOfBirth:");
        students.sort(new DateOfBirthComparator());
        System.out.println(students);
    }

}
