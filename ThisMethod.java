public class ThisMethod {
  int x;
  void sound(){
  System.out.println("Defualt");
  }
 
}
class hi extends ThisMethod{
@Override
 void sound(){
  System.out.println("inghertance");
  this.sound2();
  super.sound();
  }
void sound2(){
System.out.println("nnnnnn");

}
}

class test{
public static void main(String[] args)
 {
 ThisMethod h1=new hi();
 h1.sound();
 // System.out.println("Hello world!");
 }
}