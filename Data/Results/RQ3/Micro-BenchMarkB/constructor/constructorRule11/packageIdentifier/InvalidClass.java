// 文件：InvalidClass.java
package packageIdentifier;

// ❌ 类不是 public，却拥有一个 public 构造函数（违反规则）
class InvalidClass {
    public InvalidClass() {
        System.out.println("I'm invalid.");
    }
}
