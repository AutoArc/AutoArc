package packageIdentifier;

import otherpackage.OtherClass;

public class InvalidClass implements typeName {
    private OtherClass invalidDependency;

    public void action() {
        invalidDependency.help();
    }
}
