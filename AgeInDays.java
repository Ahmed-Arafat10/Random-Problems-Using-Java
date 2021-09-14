import java.util.*;
public class AgeInDays {
  
 public static void main(String[] args)
 {
  int input;
 Scanner Input= new Scanner(System.in);
 input =Input.nextInt();
 
 int divyear=input/365;//Used
 int resultyear=divyear*365;
 int x1 = input-resultyear;
  
int divmonth=x1/30;//Used
int resultmonth=divmonth*30;
int x2=x1-resultmonth;

System.out.println(divyear+" year(s)");
 System.out.println(divmonth+" month(s)");
 System.out.println(x2+" day(s)");
 
 
 
 }

}
