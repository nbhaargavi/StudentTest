package org.example;
import java.util.*;
class Student {
    String name;
    int age;
    protected int gpa;
    Student(String name, int age, int gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public void setName(String name, int age, int gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public String getname() {
        return this.name;
    }

    public int getage() {
        return this.age;
    }

    public int getgpa() {
        return gpa;
    }
}
public class StudentTest {
    public static void main(String[] args) {
        List<Student> mylist = new ArrayList<Student>();
        Scanner in =new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students");
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the student name");
            String name=in.nextLine();
            System.out.println("Enter the student age");
            int age=sc.nextInt();
            System.out.println("Enter the student gpa");
            int gpa=sc.nextInt();
            Student s=new Student(name,age,gpa);
            mylist.add(s);

            System.out.println("Name :"+s.getname());
            System.out.println("age  :"+s.getage());
            System.out.println("gpa :"+s.getgpa());
        }
        Collections.sort(mylist, new Comparator <Student>() {
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getgpa(), s1.getgpa());
            }
        });
        System.out.println("After sorted :");
        for(int i=0;i<n;i++) {
            System.out.printf("Name :"+mylist.get(i).getname()+" ");
            System.out.printf("Gpa :"+mylist.get(i).getgpa());
            System.out.println("");
        }
        sc.close();
    }
}
