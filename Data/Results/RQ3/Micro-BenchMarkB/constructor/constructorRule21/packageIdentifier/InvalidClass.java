// 文件：InvalidClass.java
package packageIdentifier;

public class InvalidClass {

    // ❌ 这个构造函数是 private，但没有带 @MyAnnotation 注解
    private InvalidClass() {
        System.out.println("Private constructor without annotation.");
    }
}
