// 文件：InvalidClass.java
package packageIdentifier;

// ❌ 顶层类不能是 static，因此这个类违反了规则
public class InvalidClass {
    private InvalidClass() {
        System.out.println("I'm invalid.");
    }
}
