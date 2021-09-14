import java.util.*;
class BIS{
String[] Courses=new String[5];
int NumberOfStudents;
int CreditHours;
double CreditHourFees;
int NumberOfBuildings ;
BIS(String[] str,int NOS,int CH,double CHF,int NOB ){
for(int j=0;j<5;j++){
Courses[j]=str[j];}
this.NumberOfStudents=NOS;
this.CreditHours=CH;
this.CreditHourFees=CHF;
this.NumberOfBuildings=NOB;
}
void TotalFees(){
double totalfees = CreditHours*CreditHourFees;
System.out.println("Your Total Fees is : "+totalfees);
}
void PrintProg(){
int ProgCounter=0;
for(int i=0;i<5;i++){
if(Courses[i].equals("Programming"))
ProgCounter++;
}
System.out.println("Numbers of Programming Courses is : "+ProgCounter);
}
int PrintAccounting(){
int AccCounter=0;
for(int i=0;i<5;i++){
if(Courses[i].contains("Accounting"))
AccCounter++;
}
return AccCounter;
}
}
public class Problem2Section{
public static void main(String[] args)
 {
 Scanner Obj1=new Scanner(System.in);
 String[] Course=new String[5];
 for(int i=0;i<5;i++){
 Course[i]=Obj1.nextLine();
 }
 int NOS=Obj1.nextInt();
 int CH=Obj1.nextInt();
 double CHF=Obj1.nextDouble();
 int NOF=Obj1.nextInt();
 BIS Obj =new BIS(Course,NOS,CH,CHF,NOF);
 Obj.PrintProg();
 System.out.println("Number of Courses Contains Accounting is : "+Obj.PrintAccounting());
 Obj.TotalFees();
 }
}