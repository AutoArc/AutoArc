// 文件：ValidClass.java
package otherpackage;

public class OtherClass {
    // ✅ 这个构造函数是 private，且它不在 packageIdentifier 包内
    private OtherClass() {
        System.out.println("Valid class, constructor is private.");
    }
}
