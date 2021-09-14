import java.util.*;
public class Ghada {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        Random rand = new Random();
        Vector<String> Teachers_1=new Vector<String>();
        Vector<String> Teachers_20=new Vector<String>();
String str;
int k=0;
try {
while (true){
    str=obj1.nextLine();
    if(str.equals("Done"))
        break;
       // if(str.contains("English"))
        //continue;
        Teachers_1.add(str);
        k++; }
       // String[] Teachers=new String[k];
        //for(int i=0;i<k;i++)
        //Teachers[i]=Teachers_1.get(i);
        System.out.println("For First Subject :\n");
        for(int i=0;i<10;i++){
            int room=i+1;
            System.out.println("For Room " +room);
            for(int j=0;j<2;j++) {
                int r = rand.nextInt(Teachers_1.size());
               System.out.println(Teachers_1.get(r));
               Teachers_20.add(Teachers_1.get(r));
                Teachers_1.removeElementAt(r);
            }  }
         System.out.println();
        System.out.println("For Second Subject :\n");
        for(int i=0;i<10;i++) {
            int room =i+1;
            System.out.println("For Room " +room);
            for (int j = 0; j < 1; j++) {
                if(!Teachers_1.isEmpty()){
                    //Select 10 Randomly from 10 who didn't work before
                    int r = rand.nextInt(Teachers_1.size());
                    System.out.println(Teachers_1.get(r));
                    Teachers_1.removeElementAt(r);
                    // Select 10 Randomly from 20 worked before
                     r = rand.nextInt(Teachers_20.size());
                    System.out.println(Teachers_20.get(r));
                    Teachers_20.removeElementAt(r);
                 }
                else {
                 int r = rand.nextInt(Teachers_20.size());
                }  }  }  }    
catch (IllegalArgumentException e){
System.out.println("Error ... Please enter Not Less Than 30 Name \n");
       }
    }
}
