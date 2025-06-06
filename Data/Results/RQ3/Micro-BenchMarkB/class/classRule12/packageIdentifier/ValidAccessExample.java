package packageIdentifier;

public class ValidAccessExample {

    
    protected static class ProtectedmyClass {
        public void sayHello() {
            System.out.println("Hello from protected class!");
        }
    }


    public static class PublicCaller {
        public void doCall() {
            new ProtectedmyClass().sayHello();
        }
    }
}
