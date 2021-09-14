public class AverageAndProduct1to10 {
  
 public static void main(String[] args)
 {
 float sum=0;
 float av =0;
 int prod=1;
  for(int i =1;i<=10;i++){
  sum +=i;
  prod*=i;
  }
  av = sum/10;
  System.out.println("Average = "+av);
  System.out.println("Product = "+prod);
 }

}
