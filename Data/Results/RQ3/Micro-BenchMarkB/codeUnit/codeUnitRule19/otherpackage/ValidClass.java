package otherpackage;

import packageIdentifier.typeName;

public class ValidClass implements typeName {
    public void regexMethod() { 
        System.out.println("This method is in a class that implements the interface.");
    }

    @Override
    public void someMethod() {
        System.out.println("Implementing method from typeName interface.");
    }
}
