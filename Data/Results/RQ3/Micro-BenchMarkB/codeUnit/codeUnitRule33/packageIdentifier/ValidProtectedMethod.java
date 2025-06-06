package packageIdentifier;

public class ValidProtectedMethod {

    protected void protectedMethod() {
        System.out.println("I am protected, not private.");
    }

    public void publicMethod() {
        System.out.println("Public method is fine.");
    }
}
