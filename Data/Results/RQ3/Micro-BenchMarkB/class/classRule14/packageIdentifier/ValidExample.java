package packageIdentifier;

public class ValidExample {
    public void doSomething() {
        class LocalA {
            void hello() {
                System.out.println("Hello from LocalA");
            }
        }

        LocalA a = new LocalA();
        a.hello(); 
    }
}
