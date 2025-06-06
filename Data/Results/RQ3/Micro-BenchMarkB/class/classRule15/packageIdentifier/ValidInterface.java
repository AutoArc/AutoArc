package packageIdentifier;


public interface ValidInterface {
    StaticDependencyHolder.StaticClass validMethod();
}

class StaticDependencyHolder {
    public static class StaticClass {  
    }
}