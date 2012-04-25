import spock.lang.*

class HiddenDependency2 extends Specification {

    final classUnderTest = new ClassUnderTest()

    def "should say hello"() {
        expect:
        "Hello World!" == classUnderTest.sayHello()
    }

}

