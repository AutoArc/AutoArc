// 文件：InvalidClass.java
package packageIdentifier;

class InvalidClass {
    // ❌ 这个构造函数是 package-private，且类是 package-private，违反规则
    InvalidClass() {
        System.out.println("I'm invalid.");
    }
}
