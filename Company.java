import java.util.Scanner;
class Employee {
    int eNo,eSalary;
    String eName;
    Employee(int eNo,int eSalary,String eName){
        this.eName = eName;
        this.eNo = eNo;
        this.eSalary = eSalary;
    }
    int get_id(){
        return this.eNo;
    }
}
public class Company {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Employee E[] = new Employee[10];
        int n,id,sal,sid,ch,f;
        String name;
        System.out.print("Enter number of Employees: ");
        n = read.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter ID for Employee "+ (i+1) +" : ");
            id = read.nextInt();
            System.out.print("Enter Name:");
            read.nextLine();
            name= read.nextLine();
            System.out.print("Enter Salary:");
            sal = read.nextInt();
            E[i] = new Employee(id, sal, name);
        }
        do{
            f=0;
        System.out.print("Enter Employee ID to Search: ");
        sid = read.nextInt();
        for(int i = 0;i<n;i++){
            if(E[i].get_id()==sid){
                System.out.println("Employee found!");
                System.out.println("Name: "+E[i].eName+"\nSalary: "+E[i].eSalary);
                f++;
                break;
            }
        }
        if(f==0){System.out.println("Employee not found!");}
        System.out.println("Press 1 to continue!");
        ch = read.nextInt();
    }while(ch==1);
    read.close();
    }
}


// **************OUTPUT**************

/*
Enter number of Employees: 3
Enter ID for Employee 1 : 101
Enter Name:Akash
Enter Salary:20000
Enter ID for Employee 2 : 102
Enter Name:Reema
Enter Salary:23000
Enter ID for Employee 3 : 103
Enter Name:Bibin
Enter Salary:28000
Enter Employee ID to Search: 109
Employee not found! 
Press 1 to continue!
1
Enter Employee ID to Search: 102
Employee found!
Name: Reema  
Salary: 23000
Press 1 to continue!

*/