package oop;
import java.util.*;
class checkNumber{
    void check(){
        Scanner Sc = new Scanner(System.in);
        int N = Sc.nextInt();
        if(N%2!=0){
            System.out.println("Weird");
        }
        else if(N>=2 && N<=5){
            System.out.println("Not weird");
        }
    else if (N>=6 && N<=20){
        System.out.println("weird");
    }
    else{
        System.out.println("Not weird");
    }
    Sc.close();
    }
    }


public class two {
    public static void main(String[] args) {
       checkNumber obj=new checkNumber();
          obj.check();
}
}
