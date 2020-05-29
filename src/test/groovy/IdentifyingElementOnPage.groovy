import geb.spock.GebReportingSpec

class IdentifyingElementOnPage extends GebReportingSpec{
    void someFunction(){
        given:
        browser.go("https://www.techlistic.com/p/selenium-practice-form.html")

        browser.$("input[name='firstname']").isDisplayed()
    }
}
