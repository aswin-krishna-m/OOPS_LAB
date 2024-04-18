import java.util.Scanner;

class UnameExcept extends Exception {
    public UnameExcept(String msg) {
        super(msg);
    }
}

class PassExcept extends Exception {
    public PassExcept(String msg) {
        super(msg);
    }
}

public class UDExcept {
    public static void main(String args[]) {
        String name = "john";
        String pass = "john36";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username : ");
        String user = s.nextLine();
        System.out.print("Enter password : ");
        String pwd = s.nextLine();
        s.close();
        try {
            if (!user.equals(name))
                throw new UnameExcept("Username incorrect");
            else if (!pwd.equals(pass))
                throw new PassExcept("Password incorrect");
            else
                System.out.println("Login Successful !!!");
        } catch (UnameExcept u) {
            u.printStackTrace();
        } catch (PassExcept p) {
            p.printStackTrace();
        }
    }
}


// **************OUTPUT**************

/*

Enter username : john
Enter password : john36
Login Successful !!!


*/