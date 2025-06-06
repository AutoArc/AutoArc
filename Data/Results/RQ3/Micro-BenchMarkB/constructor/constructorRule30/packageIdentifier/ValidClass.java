// 文件：ValidClass.java
package packageIdentifier;

public class ValidClass {

    // ✅ 这个构造函数是 private，且声明了抛出 Exception 类型的异常
    private ValidClass() throws Exception {
        // 构造函数的逻辑
        throw new Exception("An exception occurred");
    }
}
