import spock.lang.*

class HiddenDependency1 extends Specification {

    final classUnderTest = new ClassUnderTest()

    def "should say hello"() {
        expect:
        "Hello World!" == classUnderTest.sayHello()
    }

}

