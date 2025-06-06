package otherpackage;

public class OtherClass {

    // ✅ 这个构造函数是 private，并且类所在包不是 "packageIdentifier"
    private OtherClass() {
        System.out.println("Private constructor in class outside packageIdentifier.");
    }
}
