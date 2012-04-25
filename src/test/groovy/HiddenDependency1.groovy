import spock.lang.*

class HiddenDependency1 extends Specification {

    final collaborator = new Collaborator() {
        String collaborate() {
            "Hello World!"
        }
    }
    final classUnderTest = new ClassUnderTest(collaborator)

    def "should say hello"() {
        expect:
        "Hello World!" == classUnderTest.sayHello()
    }

}

