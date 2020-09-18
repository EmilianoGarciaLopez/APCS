public class Student {
    //class fields or private data or instance variable of Student
    private String firstname, lastname;
    private int grade;
    private double gpa;

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
    public Student(String fn, String ln, int gr, double gp)    {
        firstname = fn;
        lastname = ln;
        grade = gr;
        gpa = gp;
    }

    public String getFirstname()    {    return firstname;    }
    public String getLastname()        {    return lastname;    }

}