package packageIdentifier1; // ❌ 违反规则：类位于 packageIdentifier1 包中

public class InvalidClass {

    public InvalidClass() { // 这个构造函数不符合规则，因为它位于 packageIdentifier1 包中的类内
        // 公共构造函数
    }

    public void someMethod() {
        // 方法实现
    }
}
