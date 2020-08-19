
package prgm;
import pack1.*;
import pack1.subpack.*;
import java.util.Scanner;
public class Prgm {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int x=obj.nextInt();
        int y=obj.nextInt();
        first a1=new first();
        second a2=new second();
        third a3=new third();
        a1.add(x, y);
        a2.mul(x, y);
        a3.mod(x, y);
    }
    
}
