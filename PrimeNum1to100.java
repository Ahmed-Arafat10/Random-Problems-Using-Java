public class PrimeNum1to100 {
  
 public static void main(String[] args)
 {
 
  for(int n=1;n<=100;n++){
  if (n==1){
  System.out.println(n+ " is Not Prime.");
 continue;
 }
 if (n==2){  
  System.out.println(n+ " is Prime.");
  continue; 
  }
  if (n==3){
  System.out.println(n+ " is Prime.");
  continue;
  }
  if (n==5){
  System.out.println(n+ " is Prime.");
  continue;
  }
  if (n==7){
  System.out.println(n+ " is Prime.");
  continue;
  }
  if (n==9){
  System.out.println(n+ " is Not Prime.");
  continue;
  }
  if(n%2==0||n%3==0||n%5==0||n%7==0||n%9==0)
  System.out.println(n+ " is Not Prime.");
  else
  System.out.println(n+ " is Prime.");
  
  }
 }
}

