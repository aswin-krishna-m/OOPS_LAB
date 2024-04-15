import java.util.*;

class Employee {
    int empid, salary;
    String name, address;

    Employee(int e, String n, int s, String a) {
        this.empid = e;
        this.name = n;
        this.salary = s;
        this.address = a;
    }
}

class Teacher extends Employee {
    String department, subject;

    Teacher(int e, String n, int s, String a, String d, String sub) {
        super(e, n, s, a);
        this.department = d;
        this.subject = sub;
    }

    void display() {
        System.out.println("\nID: " + this.empid+"\nName: " + this.name+"\nSalary: " + this.salary+"\nAddress: " + this.address+"\nDepartment: " + this.department+"\nSubject: " + this.subject);
    }
}

class TeacherArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Teacher T[] = new Teacher[5];
        int num, id, sal;
        String ename, eadd, edept, esub;
        System.out.print("Enter number of employees: ");
        num = s.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("\nEnter employee ID: ");
            id = s.nextInt();
            s.nextLine();

            System.out.print("Enter employee name: ");
            ename = s.nextLine();

            System.out.print("Enter employee salary: ");
            sal = s.nextInt();
            s.nextLine();

            System.out.print("Enter employee address: ");
            eadd = s.nextLine();

            System.out.print("Enter employee department: ");
            edept = s.nextLine();

            System.out.print("Enter employee subject: ");
            esub = s.nextLine();

            T[i] = new Teacher(id, ename, sal, eadd, edept, esub);
        }
        System.out.println("\nEmployee details are:");
        for (int i = 0; i < num; i++) {
            T[i].display();
        }
        s.close();
    }
}



// **************OUTPUT**************

/*

Enter number of employees: 2

Enter employee ID: 101
Enter employee name: Aswin
Enter employee salary: 20000
Enter employee address: TH Block 
Enter employee department: MCA
Enter employee subject: AOS

Enter employee ID: 102
Enter employee name: Anand
Enter employee salary: 23000
Enter employee address: TH Town
Enter employee department: EEE
Enter employee subject: Physics

Employee details are:

ID: 101
Name: Aswin
Salary: 20000
Address: TH Block
Department: MCA
Subject: AOS

ID: 102
Name: Anand
Salary: 23000
Address: TH Town
Department: EEE
Subject: Physics

*/