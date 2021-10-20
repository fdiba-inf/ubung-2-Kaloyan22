package exercise2;
import java.util.Scanner;

public class SumOfDigits {
  public static void main (String[] args){
    Scanner input=new Scanner (System.in);
    System.out.println("Enter a number between 0 and 999");
    int num=input.nextInt();
    while (num<0||num>999){
        System.out.println("The number should be between 0 and 999. Try again.");
        num=input.nextInt();
    }
    if(num<10){
       System.out.println("Sum of digits: " + num);
    }
    if (num>=10 && num<=99){
      int number=num/10+num%10;
       System.out.println("Sum of digits: " + number);
    }
    if (num>=100 && num<=999){
      int number=num/100+num/10%10+num%10;
       System.out.println("Sum of digits: " + number);
    }
  }
}