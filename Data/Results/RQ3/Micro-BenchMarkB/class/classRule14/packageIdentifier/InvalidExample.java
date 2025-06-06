package packageIdentifier;

public class InvalidExample {
    public void doSomething() {
        class LocalA {
            void hello() {
                System.out.println("Hello from LocalA");
            }
        }

        class LocalB {
            void greet() {
                LocalA a = new LocalA(); 
                a.hello();
            }
        }

        LocalB b = new LocalB();
        b.greet();
    }
}
