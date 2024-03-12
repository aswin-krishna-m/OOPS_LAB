public class Palindrome {
    public static void main(String[] args){
        String str = args[0], rev ="";
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome ");
        }
    } 
}



// **************OUTPUT**************

/*
javac Palindrome.java 
java Palindrome malayalam 
String is palindrome
*/