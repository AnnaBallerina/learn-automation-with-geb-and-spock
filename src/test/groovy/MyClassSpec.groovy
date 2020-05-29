import spock.lang.*

// Specification class

class MyClassSpec extends Specification{
    //instance fields
    @Shared
    def obj = new SumOfTwoNumbers()

    def "Feature method one"()
    {
        given:
        obj
    }

    def "Feature method two"()
    {
        given:
        obj
    }
}
