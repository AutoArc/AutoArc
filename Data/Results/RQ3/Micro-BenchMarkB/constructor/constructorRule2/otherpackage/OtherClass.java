package otherpackage; // ❌ 违反规则：类位于 otherpackage 包中

public class OtherClass {

    private OtherClass() { // 这个构造函数不符合规则
        // 私有构造函数
    }

    public void someMethod() {
        // 方法实现
    }
}
