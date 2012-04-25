import spock.lang.*

class PassingSpec extends Specification {

    final classUnderTest = new ClassUnderTest()

    def "should say hello"() {
        expect:
        "Hello World!" == classUnderTest.sayHello()
    }

}

