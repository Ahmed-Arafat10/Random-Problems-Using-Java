public class ThisConstuctor {
  int x;
  int y;
  ThisConstuctor(int x,int y){
  this.x=x;
  this.y=y;
 
  }
  ThisConstuctor(){
  this(1,2);
  }
  
 public static void main(String[] args)
 {

  
  
  ThisConstuctor Obj=new  ThisConstuctor();
System.out.println(Obj.x);
 
 }

}
