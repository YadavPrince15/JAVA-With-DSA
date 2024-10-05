package JAVA_CODE.oops;

public class copyConstructor {
    public static void main(String[] args) {
        student s1=new student();
        s1.name ="Prince";
        s1.roll = 356;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

       student s2 =new student(s1);   //copy
        s2.password="xyz";

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class student{
    String name;
    int roll;
    String password;
    int marks[];

    //copy constructor
    student (student s1){
        marks =new int[3];
        this.name =s1.name;
        this.roll =s1.roll;
        this.marks=s1.marks;
    }
    student(){
        marks =new int[3];
        System.out.println("constructor calling");
    }
}