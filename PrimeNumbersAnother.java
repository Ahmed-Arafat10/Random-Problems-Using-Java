public class PrimeNumbersAnother {
  
 public static void main(String[] args)
 {
 // int k;
 int i;
// int m=0;
int[] counter = new int[101];
 for(i =1;i<=100;i++){
// k=0;
  for(int j=1;j<=i;j++){    
    
    if(i%j==0)
    counter[i]++;
//   k++;
    }
    //(k<2)
    if(counter[i]<2)
     System.out.println(i +" is Not Prime Number.");
         //(k>2)
    if(counter[i]>2)
     System.out.println(i +" is Not Prime Number.");      
        //(k==2)
if (counter[i]==2)
System.out.println(i +" is Prime Number");    
  
    }
    //for(int n=1;n<=100;n++){

   // }
  }
}
