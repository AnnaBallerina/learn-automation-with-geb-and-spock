import geb.spock.GebReportingSpec

class HadlingTextBoxToEnterValue extends GebReportingSpec {
    void enterValuesInLoginPortal(){
        given:
        browser.go("http://webdriveruniversity.com/Login-Portal/")

        browser.$("input#text").value("Antonio")
        browser.$("input[placeholder='Password']").value("12345")
        browser.$("button#login-button").click()
    }
}
