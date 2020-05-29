import spock.lang.Specification

class ThirdExample extends Specification{
    def "We are going to add two numbers"(){

        given:
        def obj = new SumOfTwoNumbers()

        when: "when we are going to call adder method"
        def sum = obj.adder(2,3)

        then:
        sum == 5
    }
}
