package otherpackage;

import packageIdentifier.MyAnnotation; 

public class InvalidClass2 {
    
    @MyAnnotation
    private void privateMethod() { 
        System.out.println("This is a private method in the wrong package.");
    }
}
