import java.util.*;
public class EpicGame {
 public static void main(String[] args)
 {
 Scanner Obj =new Scanner(System.in);
 int Simon = Obj.nextInt();
 int Antisimon = Obj.nextInt();
 int heap = Obj.nextInt();
 Vector<Integer> V1=new Vector<Integer>();
 while(!false){
 for(int i=1;i<=Simon;i++){
 if(Simon%i==0&&heap%i==0)
 V1.add(i);
 }
 int MaxSimon=0;
 for(int j=0;j<V1.size();j++){
 if(MaxSimon<V1.get(j))
 MaxSimon=V1.get(j);
 }
 V1.clear();
heap-=MaxSimon;
if(heap==0){ 
 System.out.println("0");
 break;
 }
for(int k=1;k<=Antisimon;k++){
if(Antisimon%k==0&&heap%k==0)
 V1.add(k);
 }
 int MaxAntisimon=0;
 for(int l=0;l<V1.size();l++){
 if(MaxAntisimon<V1.get(l))
 MaxAntisimon=V1.get(l);
 }
 V1.clear();
 heap-=MaxAntisimon;
 if(heap==0){
 System.out.println("1");
 break;
    }
   }
  }
 }
