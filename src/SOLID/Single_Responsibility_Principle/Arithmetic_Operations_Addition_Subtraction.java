package SOLID.Single_Responsibility_Principle;

public class Arithmetic_Operations_Addition_Subtraction {

    public static void sumarDigitos(int num1 , int num2){
        int suma = num1 + num2;
        System.out.println("La suma de"+ " " + num1 + " "+ "y" + " " + num2 + " " +  "es igual a" + " " + suma );
    }


    public static void restarDigitos(int num1 , int num2){
        int resta = num1 - num2;
        System.out.println("La suma de"+ " " + num1 + " "+ "y" + " " + num2 + " " +  "es igual a" + " " + resta );
    }

}

