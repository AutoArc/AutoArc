// 文件：InvalidClass.java
package packageIdentifier;

public class InvalidClass {

    // ❌ 这个构造函数是 private，但名称不以 "regex" 开头
    private InvalidClass() {
        System.out.println("Private constructor with non-matching name.");
    }
}
