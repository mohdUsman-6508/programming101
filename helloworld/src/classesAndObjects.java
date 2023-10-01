
 class Student{
    String name;
    int age;

        }

public class classesAndObjects {
    static int number;

    public static void main(String[] args) {
        
        classesAndObjects c1=new classesAndObjects();
        classesAndObjects.number=100;
        System.out.println(classesAndObjects.number);

        Student s1=new Student();
        Student s2=new Student();
        System.out.println(s2.age);
        s1.name="usman";
        s1.age=19;
        System.out.println(s1.age + s1.name);

    }
}
