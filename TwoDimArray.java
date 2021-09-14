import java.util.*;
public class TwoDimArray {
 public static void main(String[] args)
 {
 int SIZE ;
 int InsideCounter=0;
  Scanner Obj1=new Scanner(System.in);
  SIZE=Obj1.nextInt();
  int[][] MyArr=new int[SIZE][3];
 int[] Counter=new int[SIZE];
  for(int i=0;i<SIZE;i++){
  for(int j=0;j<3;j++){
  MyArr[i][j]=Obj1.nextInt();
  if(MyArr[i][j]==1)
Counter[i]++;
 if (MyArr[i][j]!=1&&MyArr[i][j]!=0)
 throw new ArithmeticException("Please Enter 1 OR 0 Only");
  }
  if (Counter[i]>=2)
InsideCounter++;
  }
/* for(int i=0;i<SIZE;i++){
for(int j=0;j<3;j++){
if(MyArr[i][j]==1)
Counter[i]++;
}
if (Counter[i]>=2)
InsideCounter++;
} */
//for(int i=0;i<SIZE;i++){
//if (Counter[i]>=2)
//InsideCounter++;
// }
System.out.println(InsideCounter);
 }
}