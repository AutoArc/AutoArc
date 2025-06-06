package packageIdentifier;

public class ValidProtectedClass {

    protected static class InnerProtectedClass {
        public void doSomething() {
            PrivateHelper helper = new PrivateHelper(); 
            helper.help();
        }
    }

    private static class PrivateHelper {
        void help() {
            System.out.println("Helping...");
        }
    }
}
