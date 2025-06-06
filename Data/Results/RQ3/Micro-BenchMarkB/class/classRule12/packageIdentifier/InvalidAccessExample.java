package packageIdentifier;


public class InvalidAccessExample {

    protected static class ProtectedmyClass {
        public void sayHello() {
            System.out.println("Hello from protected class!");
        }
    }

    static class NonPublicCaller {
        void doCall() {
            new ProtectedmyClass().sayHello(); 
        }
    }
}
