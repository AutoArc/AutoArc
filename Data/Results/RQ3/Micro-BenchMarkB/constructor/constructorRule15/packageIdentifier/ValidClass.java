// 文件：ValidClass.java
package packageIdentifier;

public final class ValidClass {
    // ✅ 这个构造函数是 package-private，且类是 final
    ValidClass() {
        System.out.println("I'm valid.");
    }
}
