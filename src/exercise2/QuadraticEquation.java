package exercise2;
import java.util.Scanner;

public class QuadraticEquation{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Type in the quadr. equation's quotients.");
    double a=input.nextDouble();
    double b=input.nextDouble();
    double c=input.nextDouble();
  while(a==0){
    System.out.println("The first quotient can't be 0. Type all of them again.");
    a=input.nextDouble();
    b=input.nextDouble();
    c=input.nextDouble();
  }
    double D = b*b-4*a*c;
    if (D<0 && a<0){
      System.out.println("Imaginary values (Keine reale Lösungen).");
    }
    if(D<0 && a>0){
      System.out.println("Unendlich viele Lösungen");
    }
    if(D==0){
      double x=-b/(2*a);
      System.out.println("Eine Lösung: x="+ x);
    }
    if(D>0){
      double x1=(-b-Math.sqrt(D))/(2*a);
      double x2=(-b+Math.sqrt(D))/(2*a);
      System.out.println("Zwei Lösungen: x1="+ x1+ " und x2="+x2);
    }
  }
}