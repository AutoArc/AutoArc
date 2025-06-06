package packageIdentifier;

import otherpackage.OtherClass;

public class InvalidClass {

    public InvalidClass() {
        OtherClass other = new OtherClass();
        other.someMethod();
    }
}
