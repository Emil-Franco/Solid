package SOLID.Liskov_Substitution_Principle;

public class Multiplication extends MathOperation{

    @Override
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }
}
