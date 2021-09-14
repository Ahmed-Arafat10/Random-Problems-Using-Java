//Written By Ahmed Arafat
import java.util.*;
public class MorseCode {
 public static void main(String[] args)
 {
 //Print To Screen Instructions to help user
 System.out.println("Welcome To Morse Code Program");
  System.out.println("Please Enter A or B to have : ");
  System.out.println("(A) Change Text to Morse Code");
  System.out.println("(B) Change Morse Code to Text");
  //Three inputs will be taken in program 
  //A OR B
 Scanner input=new Scanner(System.in);
 //Text To Morse
  Scanner input2=new Scanner(System.in);
  //Morse To Text
  Scanner input3=new Scanner(System.in);
  //char input from user wheither its A Or B
  char Text1=input.next().charAt(0);
  //if A Do This ... If B Do This
 //if input is A
  if(Text1=='A'){
  //Help User to Know what is the next step
  System.out.println("Please enter the Text you want to Convert to Morse Code \n");
  //Second STRING Input
  String Text=input2.nextLine();
  // Convert String Into Charcter ARRAY EXAMPLE string "Arafat" will be 'A' 'r' 'a' 'f' 'a' 't' as Char Array 
   char[] Morse =Text.toCharArray();
   //For Loop to check every char in CHAR ARRAY
   // Check every Index In CHAR ARRAY then it will print it Corresponding morse code with ///SPACE/// 
  for(int i=0;i<Morse.length;i++){
  if (Morse[i]=='a'||Morse[i]=='A')
  System.out.print(".- ");
  if (Morse[i]=='b'||Morse[i]=='B')
  System.out.print("-... ");
  if (Morse[i]=='c'||Morse[i]=='C')
  System.out.print("-.-. ");
  if (Morse[i]=='d'||Morse[i]=='D')
  System.out.print("-.. ");
  if (Morse[i]=='e'||Morse[i]=='E')
  System.out.print(". ");
  if (Morse[i]=='f'||Morse[i]=='F')
  System.out.print("..-. ");
  if (Morse[i]=='g'||Morse[i]=='G')
  System.out.print("--. ");
  if (Morse[i]=='h'||Morse[i]=='H')
  System.out.print(".... ");
  if (Morse[i]=='i'||Morse[i]=='I')
  System.out.print(".. ");
  if (Morse[i]=='j'||Morse[i]=='J')
  System.out.print(".--- ");
  if (Morse[i]=='k'||Morse[i]=='K')
  System.out.print("-.- ");
  if (Morse[i]=='l'||Morse[i]=='L')
  System.out.print(".-.. ");
  if (Morse[i]=='m'||Morse[i]=='M')
  System.out.print("-- ");
  if (Morse[i]=='n'||Morse[i]=='N')
  System.out.print("-. ");
  if (Morse[i]=='o'||Morse[i]=='O')
  System.out.print("--- ");
  if (Morse[i]=='p'||Morse[i]=='P')
  System.out.print(".--. ");
  if (Morse[i]=='q'||Morse[i]=='Q')
  System.out.print("--.- ");
  if (Morse[i]=='r'||Morse[i]=='R')
  System.out.print(".-. ");
  if (Morse[i]=='s'||Morse[i]=='S')
  System.out.print("... ");
  if (Morse[i]=='t'||Morse[i]=='T')
  System.out.print("- ");
  if (Morse[i]=='u'||Morse[i]=='U')
  System.out.print("..- ");
  if (Morse[i]=='v'||Morse[i]=='V')
  System.out.print("...- ");
  if (Morse[i]=='w'||Morse[i]=='W')
  System.out.print(".-- ");
  if (Morse[i]=='x'||Morse[i]=='X')
  System.out.print("-..- ");
  if (Morse[i]=='y'||Morse[i]=='Y')
  System.out.print("-.-- ");
  if (Morse[i]=='z'||Morse[i]=='Z')
  System.out.print("--.. ");
  if (Morse[i]==' ')
  System.out.print("  ");
  if (Morse[i]=='1')
  System.out.print(".--- ");
  if (Morse[i]=='2')
  System.out.print("..--- ");
  if (Morse[i]=='3')
  System.out.print("...-- ");
  if (Morse[i]=='4')
  System.out.print("....- ");
  if (Morse[i]=='5')
  System.out.print("..... ");
  if (Morse[i]=='6')
  System.out.print("-.... ");
  if (Morse[i]=='7')
  System.out.print("--... ");
  if (Morse[i]=='8')
  System.out.print("---..");
  if (Morse[i]=='9')
  System.out.print("----. ");
  if (Morse[i]=='0')
  System.out.print("----- ");
  }
  }
  //If Input is B
  if(Text1=='B'){
  //Help User to Know what is the next step
  System.out.println("Please enter the Morse Code you want to convert it to Text \n");
  //String Input From User (in form of MORSE CODE)
  String Text5=input3.nextLine();
  //Convert String Into STRING ARRAY which Remove SPACES between Mosrse code and Locate Each STRING in Array Index
 String[] MorseText=Text5.split(" ");
 //Check every index in STRING ARRAY then Print Its Corresponding Charecter
 for(int i=0;i<MorseText.length;i++){
  if(MorseText[i].equals(".-"))
  System.out.print("a");
  if(MorseText[i].equals("-..."))
  System.out.print("b");
  if(MorseText[i].equals("-.-."))
  System.out.print("c");
  if(MorseText[i].equals("-.."))
  System.out.print("d");
  if(MorseText[i].equals("."))
  System.out.print("e");
  if(MorseText[i].equals("..-."))
  System.out.print("f");
  if(MorseText[i].equals("--."))
  System.out.print("g");
  if(MorseText[i].equals("...."))
  System.out.print("h");
  if(MorseText[i].equals(".."))
  System.out.print("i");
  if(MorseText[i].equals(".---"))
  System.out.print("j");
  if(MorseText[i].equals("-.-"))
  System.out.print("k");
  if(MorseText[i].equals(".-.."))
  System.out.print("l");
  if(MorseText[i].equals("--"))
  System.out.print("m");
  if(MorseText[i].equals("-."))
  System.out.print("n");
  if(MorseText[i].equals("---"))
  System.out.print("o");
  if(MorseText[i].equals(".--."))
  System.out.print("p");
  if(MorseText[i].equals("--.-"))
  System.out.print("q");
  if(MorseText[i].equals(".-."))
  System.out.print("r");
  if(MorseText[i].equals("..."))
  System.out.print("s");
  if(MorseText[i].equals("-"))
  System.out.print("t");
  if(MorseText[i].equals("..-"))
  System.out.print("u");
  if(MorseText[i].equals("...-"))
  System.out.print("v");
  if(MorseText[i].equals(".--"))
  System.out.print("w");
  if(MorseText[i].equals("-..-"))
  System.out.print("x");
  if(MorseText[i].equals("-.--"))
  System.out.print("y");
  if(MorseText[i].equals("--.."))
  System.out.print("z");
  if(MorseText[i].equals(":"))
  System.out.print("$");
  if(MorseText[i].equals(".----"))
  System.out.print("1");
  if(MorseText[i].equals("..---"))
  System.out.print("2");
  if(MorseText[i].equals("...---"))
  System.out.print("3");
  if(MorseText[i].equals("....-"))
  System.out.print("4");
  if(MorseText[i].equals("....."))
  System.out.print("5");
  if(MorseText[i].equals("-...."))
  System.out.print("6");
  if(MorseText[i].equals("--..."))
  System.out.print("7");
  if(MorseText[i].equals("---.."))
  System.out.print("8");
  if(MorseText[i].equals("----."))
  System.out.print("9");
  if(MorseText[i].equals("-----"))
  System.out.print("0");
  if(MorseText[i].equals("  "))
  System.out.print(" ");
  }
 }
 //IF user Didn't enter A Or B
  if(Text1!='A'&&Text1!='B')
  // Error Message
  System.out.print("ERROR .. please enter A or B ");
 }
}
