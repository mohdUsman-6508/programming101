package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 21));

        Collections.sort(students,new AgeComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "(" + age + ")";
    }
}

class AgeComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}
