import java.io.*;
import java.util.*;

class EMPLOYEE{
    String Ename;
    int Eid;
    double Basic;
    double Da;
    double Gross_Sal;
    double Net_Sal;
   
    void read(String name,int eid,int basic){
       Ename=name;
       Eid=eid;
       Basic=basic;
    }
    
    void display(){
        System.out.println("Name="+Ename);
        System.out.println("Eid="+Eid);
        System.out.println("Basic="+Basic);
    }

    void compute_net_sal(){
        Gross_Sal=1.52*Basic;
        Net_Sal=0.7*Gross_Sal;
    }
}

class EmpDemo{
    public static void main(String[] args) {

        EMPLOYEE emp1=new EMPLOYEE();

        String Ename;
        int Eid;
        int Basic;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name of employee:");
        Ename=sc.next();
        System.out.println("Enter EID");
        Eid=sc.nextInt();
        System.out.println("Enter basic");
        Basic=sc.nextInt();


        emp1.read(Ename,Eid,Basic);
        emp1.display();
        emp1.compute_net_sal();
        System.out.println("Net salary:"+emp1.Net_Sal);

    }
}

