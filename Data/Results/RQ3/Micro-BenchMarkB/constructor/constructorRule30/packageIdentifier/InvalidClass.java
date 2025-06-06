// 文件：InvalidClass.java
package packageIdentifier;

public class InvalidClass {

    // ❌ 这个构造函数是 private，但没有声明抛出任何异常
    private InvalidClass() {
        System.out.println("Private constructor without declaring any throwable type.");
    }
}
