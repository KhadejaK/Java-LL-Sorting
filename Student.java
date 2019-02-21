/**
 * Models a student in a class room
 * @author kathleenobrien
 *
 */
public class Student
{
    private String name;
    private double gpa;
    
    /**
     * Constructs a Student with the given name and gpa
     * @param theName the name of the Student
     * @param thegpa the gpa of the Student
     */
    public Student(String theName, double thegpa)
    {
        name = theName;
        gpa = thegpa;
    }
    
    /**
     * Gets the name of this Student
     * @return the name of this Student
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the gpa of this Student
     * @return the gpa of this Student
     */
    public double getgpa()
    {
        return gpa;
    }
    
    @Override
    public String toString()
    {
        String s = "[" + getClass().getName() + ":"
           + "name="+ name + ","
           + "gpa=" + gpa + "]";
        return s;
    }
}