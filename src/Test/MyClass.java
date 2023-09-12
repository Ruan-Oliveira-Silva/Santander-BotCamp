package Test;

public class MyClass {
    public static void main(String[] args) {
       String firstName = "Ruan";
       String secundName = "Oliveira";

       String completName = completName ( firstName, secundName);
        System.out.println(completName);
    }

    public static String completName (String firstName, String secundName){
        return " Result " + firstName.concat(" ").concat(secundName);

    }
}
