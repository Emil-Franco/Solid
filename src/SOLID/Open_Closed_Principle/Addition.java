package SOLID.Open_Closed_Principle;

public class Addition implements  Operations{

    @Override
    public double performOperation(double num1 , double num2){
        return num1 + num2;
    }
}
