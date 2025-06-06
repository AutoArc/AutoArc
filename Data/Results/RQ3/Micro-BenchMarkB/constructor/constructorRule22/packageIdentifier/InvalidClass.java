// 文件：InvalidClass.java
package packageIdentifier;

public class InvalidClass {

    // ❌ 这个构造函数是 protected，但完整名称不符合正则表达式（比如名称不匹配）
    protected InvalidClass() {
        System.out.println("Protected constructor with non-matching name.");
    }
}
