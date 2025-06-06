// 文件：ValidClass.java
package packageIdentifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 定义注解
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
}

public class ValidClass {

    // ✅ 这个构造函数是 private 并且带有 @MyAnnotation 注解
    @MyAnnotation
    private ValidClass() {
        System.out.println("Private constructor with MyAnnotation.");
    }
}
