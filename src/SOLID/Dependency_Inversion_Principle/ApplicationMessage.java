package SOLID.Dependency_Inversion_Principle;

public class ApplicationMessage {
    private final Publisher publisher;

    public ApplicationMessage(Publisher publisher){
        this.publisher = publisher;
    }

    public void sendMessage(String message){
        publisher.publishMessage(message);
    }
}
