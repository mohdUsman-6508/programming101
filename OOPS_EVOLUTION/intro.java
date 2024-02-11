public class intro {
    public static void main(String[] args) {

        //Integer ,final ,wrapper class
        final int price = 1;

        int[] marks = {10, 9, 8, 10, 10, 9, 8, 10};
        Student s1 = new Student(2, "usman", "b.tech", "gm6508", "21elb108", marks);
//        s1.intro();
//        int markObtained = s1.totalMarks();
//        float percent = s1.percentage();
//
//        for(int i=0;i<1000000;i++){
//            s1=new Student();
//        }
        int marks1[] = {8, 8, 8, 8, 8, 8, 8, 9};
        Student s2 = new Student(1, "sahil", "b.tech", "gm6504", "21eeb103", marks1);

        s2.intro();
        s2.totalMarks();
        s2.percentage();
    }
}

//defining a class

/// here I made a class of student having properties like
// their enrollment no. ,faculty no., name, course,marks etc. and
// methods like totalmarks, percentage, intro etc.
//also uses finalise() to know when the garbage collection is happening
class Student {
    int sr_no;
    String enrolmentNumber;
    String facultyNumber;
    String name;
    String course;
    int[] marks;

    //constructor
    //overloading
    Student() {

    }

    Student(int sr_no, String name, String course, String enrolmentNumber, String facultyNumber, int[] marks) {
        this.sr_no = sr_no;
        this.name = name;
        this.course = course;
        this.enrolmentNumber = enrolmentNumber;
        this.facultyNumber = facultyNumber;
        this.marks = marks;

    }

    //methods

    void intro() {
        System.out.println(this.name + " is a student of " + this.course + " having faculty number: " + this.facultyNumber);
    }

    int totalMarks() {
        int sum = 0;
        int percentage = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("marks: " + sum + " out of " + 10 * marks.length);
        return sum;
    }

    float percentage() {
        float sum = 0;
        float per = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        per = (sum * 100) / (marks.length * 10);
        System.out.println("Percentage: " + per + "%");
        return per;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector Working:)");
    }
}