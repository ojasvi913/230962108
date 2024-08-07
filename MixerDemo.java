import java.io.*;
import java.util.*;

class Mixer{
    int arr[]=new int[100];
   
    void accept(int n){
       Scanner sc= new Scanner(System.in);
       for(int i=0,i<n,i++){
        arr[i]=sc.nextInt();
        if(i>0 && arr[i]<arr[i-1]){
            i--;
            System.out.println("Must be greater than last element");
            continue;
        }
        for(int j=0,j<i,j++){
            if(arr[i]=arr[j]){
                i--;
                System.out.println("Must not be a duplicate");
               continue;
            }
        }    
       }
    }
    
    void display(){
        for(int i:arr){
            System.out.println(i+" ");
        }
    }

    Mixer mix(Mixer A){
       int m=0,n=0,ia=0,ib=0;
       for(int i:A){
        m++:
       }
       for(int i:arr){
        n++:
       }
       int[] temp= new int[m+n];
       for(int i=0;i<m+n,i++){
         if(A[ia]<arr[ib]){
            temp[i]=A[ia];
            ia++;
         }
         else{
            temp[i]=arr[ib];
            ib++;
         }
       }
    }
}

class EmpDemo{
    public static void main(String[] args) {
        

    }
}
