package exercise2;
import java.util.Scanner;

public class DayOfWeek{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Type in the weekday number");
    int day= input.nextInt();
    while (day<1||day>7){
      System.out.println("Invalid day");
      day=input.nextInt();
    }
    switch (day){
      case 1:
      System.out.println("Day of week: "+day+"(Monday)");break;
      case 2:
      System.out.println("Day of week: "+day+"(Tuesday)");break;
      case 3:
      System.out.println("Day of week: "+day+"(Wednesday)");break;
      case 4:
      System.out.println("Day of week: "+day+"(Thursday)");break;
      case 5:
      System.out.println("Day of week: "+day+"(Friday)");break;
      case 6:
      System.out.println("Day of week: "+day+"(Saturday)");break;
      case 7:
      System.out.println("Day of week: "+day+"(Sunday)");break;
    }
  }
}