// 文件：InvalidClass.java
package packageIdentifier;

class InvalidClass {
    // ❌ 这个构造函数是 private，且类是 package-private，违反规则
    private InvalidClass() {
        System.out.println("I'm invalid.");
    }
}
