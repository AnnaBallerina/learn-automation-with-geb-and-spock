import spock.lang.Specification

class FixtureExample extends Specification{
    def setup(){
        println "we are in setup fixture"
    }

    def "feature method one"(){
        given:
        println "we are in feature method one"
    }

    def "feature method two"(){
        given:
        println "we are in feature method two"
    }

    def "feature method three"(){
        given:
        println "we are in feature method three"
    }

    def cleanup(){
        println "we are in cleanup method"
    }
}
