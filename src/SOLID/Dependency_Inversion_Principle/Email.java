package SOLID.Dependency_Inversion_Principle;

public class Email implements Publisher{
    public void publishMessage(String message) {
        System.out.println(" Send Email: " + " " + message);
    }
}
