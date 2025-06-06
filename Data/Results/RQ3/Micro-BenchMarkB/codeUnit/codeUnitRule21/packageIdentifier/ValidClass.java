package packageIdentifier;

import packageIdentifier.MyAnnotation; 

public class ValidClass {
    
    @MyAnnotation
    private void privateMethod() { 
        System.out.println("This is a private method annotated with MyAnnotation.");
    }
}
