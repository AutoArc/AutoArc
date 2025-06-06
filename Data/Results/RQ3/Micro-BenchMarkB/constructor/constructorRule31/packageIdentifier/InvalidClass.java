// 文件名：InvalidClass.java
package packageIdentifier;

public class InvalidClass {
    // ❌ 构造函数是 private，不符合规则
    private InvalidClass() {
        System.out.println("This is invalid!");
    }
}
