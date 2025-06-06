package packageIdentifier;

public class ValidClass implements TypeName {
    private MyClass dependency;

    public ValidClass() {
        this.dependency = new MyClass();
    }

    @Override
    public void process() {
      dependency.doSomething();
    }
}
