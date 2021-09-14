import java.util.*;
public class OneDimArrayTeamContest {
  
 public static void main(String[] args)
 {
 Scanner Obj1 = new Scanner(System.in);
 int size =Obj1.nextInt();
 int FSIZE = 3*size;
 int[] Myarr=new int[FSIZE];
 int Counter=0;
 for(int i=0;i<FSIZE;i++){
 Myarr[i]=Obj1.nextInt(); 
 }
 for(int i=0;i<FSIZE;i+=3){
 int x =Myarr[i]+Myarr[i+1]+Myarr[i+2];
 if(x>=2)
 Counter++;
 }
 System.out.println(Counter);
 }

}
