import spock.lang.Specification

class FourthExample extends Specification{

    def "feature method without explicit block"(){
        given:
        def a = 5
        def b = 6
        def obj = new SumOfTwoNumbers()

        when:
        def sum = obj.adder(a, b)

        then:
        sum == 11

        when:
        def list = []
        list.add(3)
        list.add(4)
        println list.get(5)

        then:
        thrown(IndexOutOfBoundsException)
        println "Finlally we have thrown the exception"
        list.size() == 2

        expect:
        Math.max(2,3) == 3

        cleanup:
        println "we are line"
    }
}
