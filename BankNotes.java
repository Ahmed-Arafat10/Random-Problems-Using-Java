import java.util.*;
public class BankNotes {
 public static void main(String[] args)
 {
// int input,n100,n50,n20,n10,n5,n1;
int input;
 Scanner Input= new Scanner(System.in);
 input =Input.nextInt();
 if(input>=0){
 int div100 =input/100;//Used
 int result100 = div100*100;
 int x1= input-result100;
 int div50 =x1/50;//Used
 int result50= div50*50;
 int x2=x1-result50;
 int div20=x2/20;//Used
 int result20=div20*20;
 int x3=x2-result20;
 int div10=x3/10;//Used
 int result10=div10*10;
 int x4=x3-result10;
 int div5=x4/5;//Used
 int result5=div5*5;
 int x5=x4-result5;
 int div2=x5/2;//Used
 int result2=div2*2;
 int x6=x5-result2;
 int div1=x6/1;//Used
 int result1=div1*1;
 int x7=x6-result1;
 System.out.println(input);
 System.out.println(div100+" nota(s) of EGP 100,00");
 System.out.println(div50+" nota(s) of EGP 50,00");
 System.out.println(div20+" nota(s) of EGP 20,00");
 System.out.println(div10+" nota(s) of EGP 10,00");
 System.out.println(div5+" nota(s) of EGP 5,00");
 System.out.println(div2+" nota(s) of EGP 2,00");
 System.out.println(div1+" nota(s) of EGP 1,00");
  }
  else
  System.out.println("Not Applicable");
 }

}
