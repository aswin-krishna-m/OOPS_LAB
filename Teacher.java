import java.util.Scanner;
class Person {
    protected String name;
    protected String gender;
    protected String address;
    protected int age;
    public Person(String name,String gender,String address,int age){
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;}
    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Gender: "+this.gender);
        System.out.println("Address: "+this.address);
        System.out.println("Age: "+this.age);}
}
class Employee extends Person {
    protected int empid;
    protected String companyName;
    protected String qualification;
    protected  double salary;
    public Employee(String name,String gender,String address,int age,int empid,String companyName,String qualification,double salary){
        super(name,gender,address,age);
        this.empid = empid;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;}
    public void display(){
        super.display();
        System.out.println("Employee ID: "+this.empid);
        System.out.println("Company Name: "+this.companyName);
        System.out.println("Qualification: "+this.qualification);
        System.out.println("Salary: "+this.salary);}
}
class Teacher extends Employee{
    protected String subject;
    protected String department;
    protected int teacherId;
    public Teacher(String name,String gender,String address,int age,int empid,String companyName,String qualification,double salary,String subject,String department,int teacherId){
        super(name, gender, address, age, empid, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;}
    public void display(){
        super.display();
        System.out.println("Subject: "+this.subject);
        System.out.println("Department: "+this.department);
        System.out.println("Teacher ID: "+this.teacherId);}
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the number of teachers(N):");
        int n = r.nextInt();
        Teacher[] teachers = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Teacher #"+(i+1));
            r.nextLine();
            System.out.print("Name: ");
            String name = r.nextLine();
            System.out.print("Gender: ");
            String gender = r.nextLine();
            System.out.print("Address: ");
            String address = r.nextLine();
            System.out.print("Age: ");
            int age = r.nextInt();
            System.out.print("EmployeeID: ");
            int empId = r.nextInt();
            r.nextLine();
            System.out.print("Company Name: ");
            String companyName = r.nextLine();
            System.out.print("Qualification: ");
            String qualification = r.nextLine();
            System.out.print("Salary: ");
            double salary = r.nextDouble();    
            r.nextLine();
            System.out.print("Subject: ");
            String subject = r.nextLine();
            System.out.print("Department: ");
            String department = r.nextLine();
            System.out.print("Teacher ID: ");
            int teacherId = r.nextInt();
            teachers[i] = new Teacher(name, gender, address, age, empId, companyName, qualification, salary, subject, department, teacherId);
        }
        r.close();
        System.out.println("\nDetails of Teachers: ");
        for (int i = 0; i < n; i++) {
            System.out.println("\nTeacher #"+(i+1));
            teachers[i].display();
        }
    }
}





// **************OUTPUT**************
/*

Enter the number of teachers(N):1
Enter details for Teacher #1
Name: Aswin
Gender: Male
Address: House number 26,Highlane
Age: 22
EmployeeID: 101
Company Name: Nest Digital
Qualification: MCA
Salary: 30000
Subject: AI
Department: Development
Teacher ID: 202

Details of Teachers:

Teacher #1
Name: Aswin
Gender: Male
Address: House number 26,Highlane
Age: 22
Employee ID: 101
Company Name: Nest Digital
Qualification: MCA
Salary: 30000.0
Subject: AI
Department: Development
Teacher ID: 202

*/