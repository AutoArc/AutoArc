package packageIdentifier;

public class InvalidPrivateMethod {

    private void privateMethod() {
    }

    public void publicMethod() {
        System.out.println("Public method is fine.");
    }
}
