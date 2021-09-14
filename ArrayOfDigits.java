public class ArrayOfDigits {
  
 public static void main(String[] args)
 {
 int x = 326;
 //THIS
// Integer obj=new Integer(x);
// String str=obj.toString();
//OR
String str=Integer.toString(x);
System.out.println(str);
//OR
//String str=String.valueOf(x);

String[] str1=str.split("");

  System.out.println(str1[0]);
 }

}
