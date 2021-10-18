public class Main
{
    public static void main (String[] args)
    {
        System.out.println(sayHi("Joe1"));
        System.out.println(sayHi("Joe2"));
        System.out.println(sayHi("Joe12"));
    }//end main method
    /*
    *Method returns a String saying Hi to a person
    * PreCondition: a name passed as a parameter
     */


    public static String sayHi(String name) //String is return type and also the parameter type
    {
        return "Hi there " + name;
    }//end sayHi method
}//end main class
