import java.util.Scanner;

public class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first student's name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter first student's marks: ");
        int marks1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter second student's name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter second student's marks: ");
        int marks2 = sc.nextInt();

        Student student1 = new Student(name1, marks1);
        Student student2 = new Student(name2, marks2);

        System.out.println("\nStudent 1");
        student1.display();

        System.out.println("\nStudent 2");
        student2.display();

        sc.close();
    }
}
