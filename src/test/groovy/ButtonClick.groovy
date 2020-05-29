import geb.spock.GebReportingSpec

class ButtonClick extends GebReportingSpec {
    void clickOnButtonFunction() {
        given:
        browser.go("http://webdriveruniversity.com/Click-Buttons/index.html")

        browser.$("span#button1").click()
    }

}
