package packageIdentifier;


public class InvalidProtectedClass {

    protected static class InnerProtectedClass {
        public void work() {
            PrivateHelper helper = new PrivateHelper();
            helper.doHelp();
        }
    }
}
