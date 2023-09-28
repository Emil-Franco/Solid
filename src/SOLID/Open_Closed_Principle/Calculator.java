package SOLID.Open_Closed_Principle;

public class Calculator {
    public double calculate(Operations operations, double num1,  double num2){
        return operations.performOperation(num1, num2);
    }
}
