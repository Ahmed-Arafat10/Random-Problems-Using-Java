 public class CPP {
  int NoOfClass;
  int NoOfAtt;
  int NoOfMeth;
 
void Greeting(){
System.out.println("Welcome to CPP");

}
  
}
 class Java 
 extends CPP{
 boolean IsOOPSuported;
 @Override
 void Greeting(){
 System.out.println("Welcome to Java");
 }
 }
class Test{
public static void main(String[] args)
 {
 Java j1=new Java();
 j1.Greeting();
  //System.out.println("Hello world!");
 }

} 