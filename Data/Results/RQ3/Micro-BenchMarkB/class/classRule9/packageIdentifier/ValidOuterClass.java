package packageIdentifier;

public class ValidOuterClass {

    public class InnerClass {
        public void doSomething() {
            MyHelperClass helper = new MyHelperClass();
            helper.help();
        }
    }
}
