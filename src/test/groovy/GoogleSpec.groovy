import geb.spock.GebReportingSpec

class GoogleSpec extends GebReportingSpec{
    void "Visit Google.com"() {

        when:
        go "/"

        then:
        title == 'Google'
    }
}
