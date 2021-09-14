public class ThisAsParameter {
  int x;
  int y;
  ThisAsParameter(){
  x=10;
  }
static ThisAsParameter Print(ThisAsParameter h1 ,ThisAsParameter h2){
ThisAsParameter h3=new ThisAsParameter();

h3.x =h1.x+h1.x;
return h3;


}
 public static void main(String[] args)
 {
 ThisAsParameter h1=new ThisAsParameter();
 ThisAsParameter h2=new ThisAsParameter();
 //h2.PrintSum(h1)
  //System.out.println(h2.PrintSum(h1));
  //int x=ThisAsParameter.Print(h1,h2) ;
  System.out.println(ThisAsParameter.Print(h1,h2));
  
 }

}


class another{
int x;

another(){

x=10;
}




}