public class PrimNumberBooleen {
 public static void main(String[] args)
 { boolean[] Prime=new boolean[101];
  for(int n=1;n<=100;n++){
  if (n==1){
  Prime[n]=false;
continue; }
 if (n==2){  
 Prime[n]=true;
  continue;  }
  if (n==3){
  Prime[n]=true;
  continue; }
  if (n==5){
  Prime[n]=false;
  continue; }
  if (n==7){
  Prime[n]=true;
  continue; }
  if (n==9){
  Prime[n]=false;
  continue; }
  if(n%2==0||n%3==0||n%5==0||n%7==0||n%9==0)
  Prime[n]= false;
  else
  Prime[n]= true; }
  for(int i=1;i<=100;i++){
  if (Prime[i]==true)
  System.out.println(i+ " is Prime.");
  if (Prime[i]==false)
  System.out.println(i+ " is Not Prime.");
     }}}
