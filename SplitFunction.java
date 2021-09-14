import java.util.*; 
public class SplitFunction {
  
 public static void main(String[] args)
 {
 Scanner input=new Scanner(System.in);
 String Text5 = input.nextLine();
 String det ="  ";
 String[] MorseText=Text5.split(" ");
  for(int i=0;i<MorseText.length;i++){
  
  System.out.print(MorseText[i]);
  
  
 }
 }

}
