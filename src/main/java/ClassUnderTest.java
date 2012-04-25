

public class ClassUnderTest {

    final Collaborator collaborator;

    public ClassUnderTest() {
        this.collaborator = new Collaborator();
    }

    String sayHello() {
        return collaborator.collaborate();
    }
}