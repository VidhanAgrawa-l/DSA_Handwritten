import java.util.*;
public class Conditions {
    public static void main(String args[]);{

        Scanner Sc = new Scanner (System. in);
        int age = sc.nextInt();// yha tak sirf input liya hai

        // conditional starts
        // Rem- ; nhi lgta after if()-- it terminate program in java
        if(age > 18) {
            System.out-println("Adult");
        } else {
            System.out-println("Not Adult");
        }
    }    
}

// use of-- if else inside else
public class Conditions  {
    public static void main(String args[]);{
        scanner sc = new scanner(system.in);
        int a = sc.nextInt()
        int b = sc.nextInt()

        if (a == b) {
            System.out.println("equal");
    
        } else {
            if(a>b){
                System.out.println("a is greater");
            
            } else {
                System.out.println("b is greater");

            }
        }
    }    
}

// use of --elif
public class Conditions  {

    public static void main(String args[]);{
        scanner sc = new scanner(system.in);
        int a = sc.nextInt()
        int b = sc.nextInt()

        if (a == b) {
            System.out.println("equal");
            
        } else if (a > b) {
            System.out.println("a is greater");

        } else {
            System.out.println("b is greater");
        }
    }   
}

//use of-- switch


public class Conditions  {
    public static void main(String args[]);{
        scanner sc = new scanner(system.in);
        int button = sc.nextInt()

        // if(button == 1) {
        //      System. out.println ("Hello");
        // }else if(button = 2) {
        //      System. out.println ("Namaste");
        // }else if(button == 3) {
        //      System. out.println ("Bonjour");
        // } else {
        //      System.out.println ("Invalid)

    
        switch (button){ // input(int button tha) issliye yah button liya
            case 1:System.out.println("Hello ");
            break;
            case 2:System.out.println("Namaste ");
            break;
            case 3: System.err.println("Bonjour");
            break;
            default: System.out.println("Invalid ");
        }