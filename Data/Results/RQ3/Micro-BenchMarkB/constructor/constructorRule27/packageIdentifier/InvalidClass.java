// 文件：InvalidClass.java
package packageIdentifier;

public class InvalidClass {

    // ❌ 这个构造函数是 public，但名称不以 "regex" 开头
    public InvalidClass() {
        System.out.println("Public constructor with non-matching name.");
    }
}
