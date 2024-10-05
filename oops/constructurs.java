package JAVA_CODE.oops;

public class constructurs{
    public static void main(String[] args) {
        Student s1 = new Student("Prince");
        Student s2 = new Student();
        Student s3 = new Student(248); 
        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s1);
       // System.out.println(s1.name);
    }
    
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Hiii , How are you");
    }
    Student(String name) {
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}