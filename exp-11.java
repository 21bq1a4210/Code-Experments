/* Write a Java Program to Handle Arithmetic Exceptions and Input Mis Match Exceptions. 
[CO1]*/
import java.util.InputMismatchException;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int c;
        try{
            Scanner sc= new Scanner(System.in);
            System.out.println("enter numatorator");
            int a=sc.nextInt();
            c=10/a;
        }catch(ArithmeticException e){
            System.out.println("ur program has arthemetic exception");
        }catch(InputMismatchException e){
            System.out.println("plz check i/p of the code");
        }finally{
            System.out.println("end of code");
        }
    }
}