import java.util.Scanner;

class Student {
    String name;
    int roll;
    double marks;
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            students[i] = new Student();
            System.out.print("Enter name of student " + (i+1) + ": ");
            students[i].name = sc.next();
            System.out.print("Enter roll number: ");
            students[i].roll = sc.nextInt();
            System.out.print("Enter marks: ");
            students[i].marks = sc.nextDouble();
        }

        System.out.println("\n--- Student Details ---");
        for(Student s : students){
            System.out.println("Name: " + s.name + ", Roll: " + s.roll + ", Marks: " + s.marks);
        }

        double totalMarks = 0;
        for(Student s : students) totalMarks += s.marks;
        System.out.println("Average Marks: " + (totalMarks / n));
    }
}
