import java.util.*;
public class IncreasingSalary {
  
 public static void main(String[] args)
 {
 double rate =0,earned=0;
 double salary;
 String n1="";
 Scanner Input= new Scanner(System.in);
 salary =Input.nextDouble();
  if(salary>=0&&salary<=400.00){
  rate = salary*15/100;
  earned=rate+salary;
  n1="In percentage: 15%";
  }
  if(salary>=400.01&&salary<=800.00){
  rate = salary*12/100;
  earned=rate+salary;
  n1="In percentage: 12%";
  }
  if(salary>=800.01&&salary<=1200.00){
  rate = salary*10/100;
  earned=rate+salary;
  n1="In percentage: 10%";
  }
  if(salary>=1200.01&&salary<=2000.00){
  rate = salary*7/100;
  earned=rate+salary;
  n1="In percentage: 7%";
  }
  if(salary>2000.00){
  rate = salary*4/100;
  earned=rate+salary;
  n1="In percentage: 4%";
  }
  System.out.println("New Salary: "+earned);
  System.out.println("Money earned: "+rate);
  System.out.println(n1);
 }

}
