import java.util.*;
public class PasswordAccessDenied {
  
 public static void main(String[] args)
 {

 int pass=0;
 Scanner Input= new Scanner(System.in);
 pass =Input.nextInt();
 while(pass!=2209){
 System.out.println("Access Denied");
 pass =Input.nextInt();
 }
  System.out.println("Access Granted");
 }

}
