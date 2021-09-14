import java.util.*;
public class TwoDimArrayHARD {
 public static void main(String[] args) {
 Scanner Obj1=new Scanner(System.in);
 int[][] MyArr=new int[6][6];
 for(int i=0;i<6;i++){
 for(int j=0;j<6;j++)
 MyArr[i][j]=Obj1.nextInt(); }
 int[] Sum=new int[16];
 //First Partition
 int t=0; int C=0;
 for(int i=0;i<4;i++){
 for(int j=0;j<3;j++){
 for(int k=0;k<3;k++){ 
 Sum[C]+=MyArr[j][k+t]; }   }
if(MyArr[1][0+t]!=0)
 Sum[C]-=MyArr[1][0+t];
 if(MyArr[1][2+t]!=0)
 Sum[C]-=MyArr[1][2+t];
t++; C++; }
//Second Partition
t=0; C=4;
 for(int i=0;i<4;i++){
 for(int j=1;j<4;j++){
 for(int k=0;k<3;k++){ 
 Sum[C]+=MyArr[j][k+t];  } }
if(MyArr[2][0+t]!=0)
 Sum[C]-=MyArr[2][0+t];
 if(MyArr[2][2+t]!=0)
 Sum[C]-=MyArr[2][2+t];
t++; C++; }
//Third Partition
t=0; C=8;
 for(int i=0;i<4;i++){
 for(int j=2;j<5;j++){
 for(int k=0;k<3;k++){ 
 Sum[C]+=MyArr[j][k+t];  }   }
if(MyArr[3][0+t]!=0)
 Sum[C]-=MyArr[3][0+t];
 if(MyArr[3][2+t]!=0)
 Sum[C]-=MyArr[3][2+t];
t++; C++;  }
 //Fourth Partition
 t=0; C=12;
 for(int i=0;i<4;i++){
 for(int j=3;j<6;j++){
 for(int k=0;k<3;k++){ 
 Sum[C]+=MyArr[j][k+t]; } }
if(MyArr[4][0+t]!=0)
 Sum[C]-=MyArr[4][0+t];
 if(MyArr[4][2+t]!=0)
 Sum[C]-=MyArr[4][2+t];
t++; C++; }
int Max =Sum[0];
for(int i=0;i<Sum.length;i++){
if(Max<Sum[i])
Max=Sum[i]; }
   System.out.println(Max);
 }
}
