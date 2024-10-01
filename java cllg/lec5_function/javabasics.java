// function or method --block of code jisko ek baar kaam bta diya hai aab simply use krna hai(reusable)
// ex- remote ka koi button ko dawao toh uska jo function ho vo perform krta hai
// method issliye bolte hai bcoz -- jo function CLASS ke under likha rheta hai usse method khete haii
//                               -- java mai function hmesa class ke under hi hoga isliye always we can call it method 

public class javabasics {
    public static void printhelloworld(){
        
        System.out.println("HWLLO WORLD!!!"); //public static --access modifier
        System.out.println("HWLLO WORLD!!!"); //void --return type ,ex-int
        System.out.println("HWLLO WORLD!!!"); //printhelloworld -- name of function 
        // return; -- it is compulsary but since the return type is void we can avoid return 
    
    
    
    public static void main(String args[]){
        //main-- main fun never return anything, it is reserved keyword in java,
        //(String args[])-- this tell us ki, main() ne jo input liya hai vo ek string hai args name kii and [] -it is an array
        printhelloworld(); // call function
    }

}


//syntax with parameter(input)

//no.1 tarika

public class javabasics {
    public static void printhelloworld(){
        
        System.out.println("HWLLO WORLD!!!"); 
        System.out.println("HWLLO WORLD!!!");
        System.out.println("HWLLO WORLD!!!"); 
    }

    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println("sum is :" + sum);

    }
    
    
    public static void main(String args[]){
         printhelloworld(); // call function
         calculateSum();
    }    
}    

// tarika no.2 

public class javabasics {
    public static void printhelloworld(){
        
        System.out.println("HWLLO WORLD!!!"); 
        System.out.println("HWLLO WORLD!!!");
        System.out.println("HWLLO WORLD!!!"); 
    }

    public static void calculateSum(int a, int b) {
       
        int sum = a + b ;
        System.out.println("sum is :" + sum);

    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printhelloworld(); // call function
        calculateSum(a,b); // call with parameter
    }    
}    

// tarika no.3-- using return type 

public class javabasics {
    public static void printhelloworld(){
        
        System.out.println("HWLLO WORLD!!!"); 
        System.out.println("HWLLO WORLD!!!");
        System.out.println("HWLLO WORLD!!!"); 
    }

    public static int calculateSum(int a, int b) { // parameter or formal parameter
       
        int sum = a + b ;
        return sum;

    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printhelloworld(); // call function
        int sum = calculateSum(a,b); // call with parameter-- arguments or actual parameter
        System.out.println("sum is :" + sum);
    }   
}    


// scope--Screenshot
