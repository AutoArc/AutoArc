package packageIdentifier;

import otherpackage.OtherClass; // 依赖了不符合规则的类

public class InvalidClass implements TypeName {
    private OtherClass dependency;

    public InvalidClass() {
        this.dependency = new OtherClass();
    }

    @Override
    public void process() {
        dependency.help();
    }
}
