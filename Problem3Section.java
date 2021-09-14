class Animal{
String Name;
int Age;
int NumberOflegs;
void Eat(){
System.out.println("Eating");
}
void Walk(){
System.out.println("Walking");
}
}
class Bird extends Animal{
void Fly(){
System.out.println("Flying");
}
@Override 
void Eat(){
System.out.println("Eating Seeds");
}
}
class WildBird extends Bird{
int NumberOfKids;
@Override
void Eat(){
System.out.println("Eating Meat");
}
@Override
void Fly(){
System.out.println("Flying Wild");
}
}
class Cat extends Animal{
int NumberOfKitties;
@Override
void Walk(){
System.out.println("Walking Cat");
}

}
public class Problem3Section {
  
 public static void main(String[] args)
 {
 Animal obj1 = new Animal();
 Bird obj2 = new Bird();
 WildBird obj3 = new WildBird();
 Cat obj4 = new Cat();  
 obj1.Eat();
 obj1.Walk();
 obj2.Fly();
 obj3.Eat();
 obj3.Fly();
 obj4.Walk();
 }

}
