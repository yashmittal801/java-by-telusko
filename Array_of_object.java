class Student{
    String name;
    int marks;
}
public class Array_of_object {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Yash";
        s1.marks=75;

        Student s2=new Student();
        s2.name="Mittal";
        s2.marks=85;

        Student s3=new Student();
        s3.name="Vansh";
        s3.marks=95;

        Student Students[]=new Student[3];
        Students[0]=s1;
        Students[1]=s2;
        Students[2]=s3;
        // for(int i=0;i<Students.length;i++){
        //     System.out.println(Students[i].name+" : "+Students[i].marks);
        // }

        // Enhanced for loop

        for(Student stud : Students){
            System.out.println(stud.name+" : "+stud.marks);
        }


    }
    
}
