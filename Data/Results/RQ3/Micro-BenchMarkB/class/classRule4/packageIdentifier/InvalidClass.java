package packageIdentifier;

import otherpackage.OtherClass; // 依赖不符合规则的类

public class InvalidClass {
    private OtherClass dependency;

    public InvalidClass() {
        this.dependency = new OtherClass();
    }

    public void execute() {
        dependency.help();
    }
}
