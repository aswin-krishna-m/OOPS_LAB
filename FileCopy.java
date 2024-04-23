import java.io.*;
import java.util.*;
class FileCopy{
 public static void main(String arg[]) throws Exception {
    int c;
 Scanner s = new Scanner(System.in);
 System.out.print("Enter source file name: ");
 String sf = s.next();
 System.out.print("Enter destination file name: ");
 String df = s.next();
 s.close();
 FileReader fi = new FileReader(sf);
 FileWriter fo = new FileWriter(df, true); 
 while ((c = fi.read()) != -1) {
 fo.write(c);
 }
 System.out.println("Copied to "+df);
 fi.close();
 fo.close();
 }
}


// **************OUTPUT**************

/*
Enter source file name: f1.txt
Enter destination file name: f2.txt
Copied to f2.txt

*/