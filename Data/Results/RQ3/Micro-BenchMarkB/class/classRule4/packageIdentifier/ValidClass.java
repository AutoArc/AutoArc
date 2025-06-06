package packageIdentifier;

public class ValidClass {
    private MyClass dependency;

    public ValidClass() {
        this.dependency = new MyClass();
    }

    public void execute() {
        dependency.doSomething();
    }
}
