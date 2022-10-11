import java.util.Scanner;

public class FibSequence {
    
        public static double Fibonacci(double fibonacciNum1, double fibonacciNum2, double count) {
           System.out.print(fibonacciNum1 + fibonacciNum2 +" ");
           double term = 1;
           double num = 0;
          if (count <= term || term == num) { 
           }
           else {            
           Fibonacci(fibonacciNum2,fibonacciNum1 + fibonacciNum2, count - term);
           }
        return count ;
       
        }
    
        public static void main(String[] args) throws Exception {
           //while(true){
            // if(count.equals("-1")){
            // System.out.println("Thanks for using fibonacci sequence app, GoodBye!");
            //  break;
           // while(true){
            Scanner sc = new Scanner(System.in);  
           System.out.println("Welcome to Fibonacci sequence How many step by step number sequences would you like? \n Notice: will print a double data type!");
            double codeR = sc.nextDouble();  
            Fibonacci(1, 0, codeR);
            sc.close();
           // for (codeR = 1; codeR <= codeR - 1; ++codeR) {
        //    //Scanner sc = new Scanner(System.in);  
        //    System.out.println("Welcome to Fibonacci sequence How many step by step number sequences would you like? \n Notice: will print a double data type!");
        //    //double codeR = sc.nextDouble();  
        //    Fibonacci(1, 0, codeR);
        //   sc.close();
        //     }
        //}
    
     }
    }
    