package packageIdentifier;

public class InvalidClass {

    private void shouldNotBeHere() {
        System.out.println(" Private method in restricted package.");
    }

    public void okayMethod() {
    }
}
