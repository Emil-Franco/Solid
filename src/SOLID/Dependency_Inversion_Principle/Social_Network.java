package SOLID.Dependency_Inversion_Principle;

public class Social_Network implements Publisher{
    @Override
    public void publishMessage(String message) {
        System.out.println("Posting on social networks" + " " + message);
    }
}
