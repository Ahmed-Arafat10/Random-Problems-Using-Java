public class DividingTheAverages {
  
 public static void main(String[] args)
 {
 float even=0,aveven=0,odd=0,avodd=0,result=0;
 int counteven=0,countodd=0;
 
  for(int i=1;i<=100;i++){
  
  if(i%2==0){
  even +=i;
  counteven++;
  } 
  
  }
  aveven = even/counteven;
  for(int n=101;n<=200;n++){
  if(n%2==0){ }
  else {
  odd +=n;
  countodd++;
  }
  }
  avodd = odd/countodd;
  result=aveven/avodd;
  
  System.out.println("The Average of Even Numbers From 1 to 100 is = "+aveven);
  System.out.println("The Average of Odd Numbers From 101 to 200 is = "+avodd);
  System.out.println("The Result of Dividing them is = "+result);
  }
  
  }
 



