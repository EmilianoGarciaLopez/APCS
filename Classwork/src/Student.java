public class Student {
    //class fields or private data or instance variable of Student
    private String firstname, lastname;
    private int grade;
    private final double gpa;

    /*  Constructors are special methods of a class that help buildd
    an instance of  that object when calling the new keyword. Constructors
    have no return and they are not designated with anything
    */

    /**
     * Parameterized constructor for class student
     * @param fn First name, a String
     * @param ln Last name,  a String
     * @param gr Grade, and int
     * @param gp GPA, a double
     */
    public Student (String fn, String ln, int gr, double gp)    {
        firstname = fn;
        lastname = ln;
        grade = gr;
        gpa = gp;
    }
    /* standard method
    public Student() {
        firstname = new String();
        lastname = new String();
        grade = 0;
        gpa = 0.;
    }  */

    public String getFirstname()    {return firstname;}
    public String getLastname()     {return lastname;}
    public int getGrade()           {return grade;}
    public double getGPA()          {return gpa;}

    //mutator methods
    public void setFirstName(String newFN) { firstname = newFN; }
    public void setLastname(String newLN) { lastname = newLN; }
    public void setGrade(int newGrade) { grade = newGrade; }
    public void setGPA(String newGPA) { firstname = newGPA; }

    public static void main(String[] args) {
        Student s1 = new Student("PJ", "Gillispie", 11, 4.2);
        Student s2 = new Student("Abby", "Goldman", 12, 4.2);


        System.out.println(s1.getClass());
        System.out.println(s1);
    }

}