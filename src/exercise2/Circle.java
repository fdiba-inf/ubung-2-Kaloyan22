package exercise2;
import java.util.Scanner;

public class Circle{
  public static void main (String[] args){
    Scanner input=new Scanner(System.in);
     System.out.println("Enter radius: ");
     int r = input.nextInt();
     float Cir, Ar;
     float Pi=4*(1-1/3+1/5-1/7+1/11-1/13+1/17-1/19+1/23);
     Cir=2*Pi*r;
     Ar=Pi*r*r;
     System.out.println("Circumference: " + Cir);
     System.out.println("Area: " + Ar);
  }
}