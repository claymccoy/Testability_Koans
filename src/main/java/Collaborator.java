
public class Collaborator {

    public static final Collaborator INSTANCE = new Collaborator();

    public String collaborate() {
        throw new IllegalStateException("Something not been properly initialized!");
    }

}
