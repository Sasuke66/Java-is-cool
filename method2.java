
// method with diff parameters example
// public class method2 {
//     static int plusmeth(int a, int b) {
//         return a + b;
//     }

//     static double plusmeth1(double a, double b) {
//         return  a + b;
//     }

//     public static void main(String[] args) {
//         int result1 =  plusmeth(5, 7);
//         double result2 = plusmeth1(10.66, 2.45);
//         System.out.println(result1);
//         System.out.println(result2);


//     }
// }




// method overloading example
// public class method2 {
//     static int plusmeth(int a, int b) {
//         return a + b;
//     }

//     static double plusmeth(double a, double b) {
//         return  a + b;
//     }

//     public static void main(String[] args) {
//         int result1 =  plusmeth(5, 7);
//         double result2 = plusmeth(30.66, 2.65);
//         System.out.println(result1);
//         System.out.println(result2);


//     }
// }


// example of parameter and argument used in methods... 
//string f is parameter but once its  called in method it becomes argument.

// public class method2 {
//     static void meth3 (String f) {                 //(string f) is a parameter...
//         System.out.println(f + " is unknown");     // f is an argument 
//     }

//     public static void main(String[] args) {
//         meth3("Raj");
//         meth3("Satwik");
//     }
// }


public class method2 {
    static void meth3 (int age) {
        if ( age < 18 ) {
            System.out.println("You are a kid");
        }
        else {
            System.out.println("You are an adult");
        }
    }
    public static void main(String[] args) {
        meth3(17);
    }
}