package packageIdentifier;

public class InvalidAccess {
    public void doCall() {
        NonPublicClass npc = new NonPublicClass();  
        npc.sayHi();
    }
}
