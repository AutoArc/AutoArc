package packageIdentifier;

import otherpackage.WrongDependency; 


public class InvalidClass {
    private WrongDependency dependency;

    public void doSomething() {
        dependency.badRun();
    }
}
