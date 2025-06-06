// 文件：ValidClass.java
package packageIdentifier;

public class ValidClass {

    // ✅ 这个构造函数是 private，且名称以 "regex" 开头
    private RegexConstructor() {
        System.out.println("Private constructor with name starting with 'regex'.");
    }
}
