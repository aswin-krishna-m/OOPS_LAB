public class JStrCMDCheckStart {
    public static void main(String[] args) {
        String str = args[0];
        String checkString = "hello";
        System.out.println(str.startsWith(checkString)?"The string starts with "+checkString:"String doesn't start with " + checkString);
    }
}


// **************OUTPUT**************

/*

java JStrCMDCheckStart hello world  
The string starts with hello

*/