public class Student 
{
    // Attributer
    private String firstName;
    private String lastName;
    private int age;

    // Constructor
    public Student(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    // Methodes
    public String getFirstName()
    {
        return firstName;
    }
     public String getLastName()
    {
        return lastName;
    }

    // Metode

    // 2. måde at gøre det på
    // public void printInfo()
    // {
    //     System.out.println(firstName + " " + lastName + " " + age);
    // }

    // 3. måde at gøre det på
    public String printInfo()
    {
       return firstName + " " + lastName + " " + age;
    }
}