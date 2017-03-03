public class StudentRun
{
    public static void main(String[] args)
    {
        // Student st = new Student("Claus", "Bove", 24);
        // Student st1 = new Student("Claus", "Bove", 24);
        // Student st2 = new Student("Claus", "Bove", 24);

        Student[] students = new Student[10];
        students[0] = new Student("Claus", "Bove", 24);
        students[1] = new Student("Anna", "Bove", 30);
        students[2] = new Student("ib", "hansen", 204);
        students[3] = new Student("hadjhak", "asdsd", 55);
        students[4] = new Student("Claus1", "Bove", 24);
        students[5] = new Student("Claus2", "Bove", 24);
        students[6] = new Student("Claus3", "Bove", 24);
        students[7] = new Student("Claus4", "Bove", 24);
        students[8] = new Student("Claus5", "Bove", 24);
        students[9] = new Student("Claus6", "Bove", 24);

        // 1. måde at gøre det på
        //System.out.println(students[0].getFirstName() + " " + students[0].getLastName() + " " + students[0].getAge());
        
        // 2. måde at gøre det på
        // students[0].printInfo();

        // 3. måde at gøre det på
        System.out.println(students[0].printInfo());
    }
}