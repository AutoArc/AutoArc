// 文件：InvalidClass.java
package packageIdentifier1;

public class InvalidClass {
    // ❌ 这是一个 public 构造函数，它声明在 packageIdentifier1 包中的类中，违反了规则
    public InvalidClass() {
        System.out.println("Invalid class, public constructor in public class inside packageIdentifier1.");
    }
}
