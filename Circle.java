import java.util.*;
public class Circle {
  private double Radius;
  private String Color;
 Circle(){
 this.Radius=1.0;
 this.Color="Black";
 }
 Circle(double R){
  this.Radius=R;
  this.Color="Black";
 }
 Circle(double R,String C){
 this.Radius=R;
 this.Color=C;
 }
 
 public long getArea(){
 double A=Radius*Radius*Math.PI;
Long z= Math.round(A);

 return z;
 }
 
 void PrintArea(){
 System.out.println("\"Your "+Color+" Circle with radius "+Radius+" has area equal to "+getArea()+" after rounding\"");
 }

}
 class TestCircle{

public static void main(String[] args)
 {
 Scanner Obj1=new Scanner(System.in);
 double x=Obj1.nextDouble();
 double y=Obj1.nextDouble();
 String z=Obj1.next();
 Circle c1=new Circle();
 Circle c2=new Circle(x);
 Circle c3=new Circle(y,z);
 c1.getArea();
 c2.getArea();
 c3.getArea();
 c1.PrintArea();
 c2.PrintArea();
 c3.PrintArea();
 }
}