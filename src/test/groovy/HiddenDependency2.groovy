import spock.lang.*

class HiddenDependency2 extends Specification {

    final collaborator = Mock(Collaborator)
    final classUnderTest = new ClassUnderTest(collaborator)

    def setup() {
        collaborator.collaborate() >> { 'Hello World!' }
    }

    def "should say hello"() {
        expect:
        "Hello World!" == classUnderTest.sayHello()
    }

}

