package mypackage;

public class StaticClass {
    public static class SClass {
        public void execute() {
            InvalidClass.sayHello();  // ❌ 违反 ArchUnit 规则
        }
    }
}
