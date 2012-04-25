

public class ClassUnderTest {

    final Collaborator collaborator;

    public ClassUnderTest() {
        this.collaborator = Collaborator.INSTANCE;
    }

    String sayHello() {
        return collaborator.collaborate();
    }
}