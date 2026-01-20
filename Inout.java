package oop;
import java.util.*;
class Print{
    void show(){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);
     Sc.close();
    }
    }
public class Inout {
    public static void main(String[] args) {
        Print obj =new Print();
        obj.show();
    }
}
