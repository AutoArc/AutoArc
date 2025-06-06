package packageIdentifier;


public interface AnotherInvalidInterface {
    DependencyHolder.NonStaticInnerClass invalidMethod();
}

class DependencyHolder {
    public class NonStaticInnerClass {  
    }
}