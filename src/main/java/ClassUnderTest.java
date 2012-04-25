

public class ClassUnderTest {

    final Collaborator collaborator;

    public ClassUnderTest(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    String sayHello() {
        return collaborator.collaborate();
    }
}