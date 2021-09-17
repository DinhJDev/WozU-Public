package com.example;

/*To encourage good grades, Wheeler County High School has decided to award each student a cafeteria credit that is 10 times the student's grade point average. In other words, a student with a 3.2-grade point average
* receives a $32 credit. Create a class (CafeteriaCredit) that prompts a student for a name and grade point average, and then passes the values to a method that displays a descriptive message. The messages uses the
* student's name, echoes the grade point average, and computes and displays the credit.*/

import java.util.Scanner;

class CafeteriaCredit {
        public static void computeCredit(double gpa, String name) {
            System.out.println(name + " earned $" + gpa*10 + " with a " + gpa + " GPA.");
        }
}

public class SolutionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input student's name:");
        String name = sc.nextLine();
        System.out.println("Input student's GPA:");
        double gpa = sc.nextDouble();
        sc.close();
        CafeteriaCredit.computeCredit(gpa, name);
    }
}