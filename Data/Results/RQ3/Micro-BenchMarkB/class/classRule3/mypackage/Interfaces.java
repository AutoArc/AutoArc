package mypackage;

import packageIdentifier.MyClass;

public interface ValidInterface { // ✅ 符合规则
    void process(MyClass obj); // 依赖符合匹配规则的 MyClass
}

public interface InvalidInterface { // ❌ 违反规则
    void process(OtherClass obj); // 依赖了不符合规则的 OtherClass
}
