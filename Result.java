interface Academic {
    double cgpa();
}
class Student {
    String name;
    int roll;
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}
class Sports {
    String sport;
    int score;
    public Sports(String sport, int score) {
        this.sport = sport;
        this.score = score;
    }
}
class Result extends Student implements Academic {
    Sports sports;
    double cgpa;
    public Result(String name, int roll, String sport, double cgpa, int Score) {
        super(name, roll);
        this.sports = new Sports(sport, Score);
        this.cgpa = cgpa;
    }
    @Override
    public double cgpa() {
        return cgpa;
    }
    public String Sport() {
        return sports.sport;
    }
    public int Score() {
        return sports.score;
    }
    public void displayScores() {
        System.out.println("\nStudent Name: " + this.name
        + "\nRoll Number: " + this.roll 
        + "\nAcademic Score: " + this.cgpa() 
        +"\nSports Score for " + this.Sport() + ": " + this.Score());
    }
    public static void main(String[] args) {
        Result s1 = new Result("John", 21, "Football", 8.5, 92);
        Result s2 = new Result("Akhil", 11, "Cricket", 7.5, 87);
        s1.displayScores();
        s2.displayScores();
    }
}


// **************OUTPUT**************

/*

Student Name: John
Roll Number: 21
Academic Score: 8.5
Sports Score for Football: 92

Student Name: Akhil
Roll Number: 11
Academic Score: 7.5
Sports Score for Cricket: 87

*/