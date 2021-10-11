package com.cjss.training;

import java.util.*;

/**
 * ArrayList - To store collection of elements. Insertion order - same, duplicates allowed
 * HashSet - Insertion order - unordered
 * HashMap - hash table based implementation of Java
 * Generics - Restrict the type of object that can be stored in collection
 */
public class Collections {
    public static void main(String args[]) {

        List al1 = new ArrayList();
        al1.add("Rama");
        al1.add("Krishnna");
        al1.add("test");
        al1.add("Rama");
        al1.add("10");
        al1.add("10.2");
        // remove()
        // set(0, "test")


        System.out.println(al1);
        /* for (Object o: al1) {
            System.out.println(o);
        }*/

        Set set1 = new HashSet();
        set1.add("Rama");
        set1.add("Krishnna");
        set1.add("test");
        set1.add("Rama");
        set1.add("10");
        set1.add("10.2");

        System.out.println(set1);

        Map map1 = new HashMap();

    }
}


/*

 Task
 ----
 Define below classes
 Student (rno, name, branch, year)
 StudentFee (rno, amount, date)
 Subjects(subjectNo, subjectName)
 StudentMarks(rno, year, subjectNo, marks)

 Task 1: Print student rno, name, branch of 1st year students
 Task 2: Print all students rno, name, branch, amount, date
 Task 3: Print all students rno, name, subjectName, marks
 Task 3: Print all students rno, name, subjectName, marks order by year

 Note: To take input use Scanner as per https://www.javatpoint.com/how-to-get-input-from-user-in-java

 */
