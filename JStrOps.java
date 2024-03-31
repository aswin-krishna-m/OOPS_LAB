
class JStrOps{
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("The String is : " + str);
        System.out.println("Length of string is : "+ str.length());
        System.out.println("Character at 2nd and 4th position is : "+str.charAt(1)+" , "+str.charAt(3));
        System.out.println("Substring using starting index only is : "+str.substring(5));
        System.out.println("Substring using starting index and ending index is : "+str.substring(0,4));
    }
}



// **************OUTPUT**************
/*

The String is : Hello World!
Length of string is : 12
Character at 2nd and 4th position is : e , l
Substring using starting index only is :  World!
Substring using starting index and ending index is : Hell

*/