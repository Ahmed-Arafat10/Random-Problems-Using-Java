import java.util.*;
public class ACM_Employee {
 String E_Name;
 String E_Department;
 double E_Salary;
int E_HoursePerMonth;

ACM_Employee(String N,String D , double S , int HPM){
this.E_Name= N;
this.E_Department=D;
this.E_Salary=S;
this.E_HoursePerMonth=HPM;
}

double SalaryPerHour(){
double SalaryPerHour=E_Salary/E_HoursePerMonth;
return SalaryPerHour;
}
void PrintData(){

System.out.println("Employee Name is "+E_Name+" and working in "+E_Department+" department with salary = "+E_Salary+" L.E");

}
 

}

class Solution{

public static void main(String[] args)
 {
 Scanner Obj=new Scanner(System.in);
 String N,D;
 double S;
 int HPM;
 N=Obj.nextLine();
 D=Obj.nextLine();
 S=Obj.nextDouble();
 HPM=Obj.nextInt();
 
 ACM_Employee e1 = new ACM_Employee(N,D,S,HPM);
 ACM_Employee e2 = new ACM_Employee(N,D,S,HPM);
 System.out.println("The Salary per hour for "+e2.E_Name+" is: "+e2.SalaryPerHour()+" L.E");
 
 e2.PrintData();
 
 }


}