import spock.lang.Specification

class FirstSpockExample extends Specification{

    def "we are going to see max value using Math class"()
    {
        expect:
        Math.max(2,3) == 4
    }
}
