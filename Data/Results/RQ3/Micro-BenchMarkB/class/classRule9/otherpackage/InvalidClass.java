package otherpackage;

public class InvalidClass {

    public class InnerClass {
        public void doWork() {
            NotMatchingName obj = new NotMatchingName();
            obj.work();
        }
    }
}
