  class example{
 int num ;
 String name;
public example(){
 num = 100;
 }
 public  void setName(String n){
 this.name=n;
 
 }
 
 public String getName (){
 return name;
 
 }

}
 class Class {
 
 public static void main (String args[])
 {
  example obj1 = new example();
  System.out.println(obj1.num);
obj1.setName("Hello World");
  System.out.println(obj1.getName());
  
 }

}
