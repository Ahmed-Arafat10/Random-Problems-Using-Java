import java.util.Scanner;
 class Sum{
float num1;
float num2;
static float sum =0;
Sum(float n1,float n2){
num1=n1;
num2=n2;
}
float GetSum(){
sum +=num1+num2;
return sum;
}
}
  class StaticSum {
 public static void main(String[] args)
 {
 Scanner f = new Scanner(System.in);
 float n1 = f.nextFloat();
 Scanner s = new Scanner(System.in);
 float n2 = s.nextFloat();
  Sum Obj1 = new Sum(n1,n2);
  Sum Obj2 = new Sum(10,20);
  Sum Obj3 = new Sum(10,20);
  System.out.println("Sum Of First Object Is "+Obj1.GetSum());
  System.out.println("Sum Of Second Object Is "+Obj2.GetSum());
  System.out.println("Sum Of Third Object Is "+Obj3.GetSum());
 }
}
