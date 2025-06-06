// 文件：InvalidClass.java
package packageIdentifier;

public class InvalidClass {

    // ❌ 这个构造函数是 private，并且类所在包是 "packageIdentifier"
    private InvalidClass() {
        System.out.println("Private constructor in class inside packageIdentifier.");
    }
}
