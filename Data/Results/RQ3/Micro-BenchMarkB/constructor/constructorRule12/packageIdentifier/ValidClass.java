// 文件：ValidClass.java
package packageIdentifier;

// ✅ 类是 public，构造函数也是 public（符合规则）
public class ValidClass {

    // ✅ 嵌套 static 类，拥有 private 构造函数 —— 合法
    public static class ValidStaticInnerClass {
        private ValidStaticInnerClass() {
            System.out.println("I'm valid.");
        }
    }
}
