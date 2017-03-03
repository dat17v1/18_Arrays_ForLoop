public class Arr 
{
    public static void main(String[] args)
    {
        // Primitive Data Typer
        //int tal = 0;
        //double talMedPunktum = 2.0;
        //char = 'C';
        //String navn;
        // navn = "Claus";
        // boolean isAlive = true;


        // Array
        String[] students = new String[10];
        students[0] = "Ib";
        students[1] = "Bo";
        students[2] = "eA";
        students[3] = "My";
        // overskrive
        students[3] = "Hans";

        students[0] = "";
        students[1] = null;



        System.out.println("=====================");
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println("=====================");

        System.out.println(students[100]);


        // Object
       // Animal cat = new Animal();




    }
}