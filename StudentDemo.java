import java.io.*;
import java.util.*;

class STUDENT{
    String sname;
    int marks_array[];
    int total;
    int avg;
   
    void assign(String name,int[] marks){
       sname=name;
       marks_array=marks;
    }
    
    void display(){
        System.out.println("Name="+sname);
        System.out.print("Marks:");
        for(int i:marks_array){
            System.out.print(i+" ");
        }
    }

    void compute(){
        for(int i:marks_array){
            total+=i;
        }
        avg=total/5;
    }
}

class StudentDemo{
    public static void main(String[] args) {
        STUDENT stud1=new STUDENT();
        String name;
        int[] marks=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name of student");
        name=sc.next();
        System.out.println("Enter marks of 5 subjects of student");
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }

        stud1.assign(name,marks);
        stud1.display();
        stud1.compute();
        System.out.println("total:"+stud1.total+"\naverage:"+stud1.avg);

    }
}

