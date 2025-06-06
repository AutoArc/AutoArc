package packageIdentifier;

public class InvalidProtectedClass {

    protected static class InnerProtectedClass {
        public void doSomething() {
           
            Helper helper = new Helper();  
            helper.assist();
        }
    }
}
