// 文件：InvalidClass.java
package packageIdentifier;

public class InvalidClass {
    // ❌ 这个构造函数是 private，且它在 packageIdentifier 包内，违反了规则
    private InvalidClass() {
        System.out.println("Invalid class, constructor is private.");
    }
}
