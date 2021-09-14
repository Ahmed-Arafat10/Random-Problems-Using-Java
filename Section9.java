import java.util.*;
public class Section9 {

 public static void main(String[] args)
 {
 Scanner Obj =new Scanner(System.in);
 String un =Obj.next();
 String pw =Obj.next();
 String em =Obj.next();
 int lvl= Obj.nextInt();
 String fn= Obj.next();
 
 User u1= new User(un,pw,em,lvl ,fn);
 u1.Check();
 }

}

class User{

String Username;
String Password;
String Email;
int Level;
String FullName;
//User{}()
User(String un ,String pw ,String em , int lvl,String fn){
this.Username=un;
this.Password=pw;
this.Email=em;
this.Level=lvl;
this.FullName=fn;
}

void Check(){
if ((this.Username).equals(this.FullName)||(this.Email).equals("example@example.com"))
System.out.println("Wrong Data");
else if ((this.Username)==null||(this.Password)==null||(this.FullName)==null||(this.Email)==null||this.Level==0)
System.out.println("Null Value Entered");
else
System.out.println("Reg. done");

}


}