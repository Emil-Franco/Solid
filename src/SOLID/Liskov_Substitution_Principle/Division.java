package SOLID.Liskov_Substitution_Principle;

public class Division extends MathOperation{

    @Override
    public double calculate(double num1, double num2) {

        if (num2 == 0){
            throw new IllegalArgumentException("No se permiten divison entre 0");
        }
        return num1 / num2;
    }
}
