import geb.spock.GebReportingSpec

class fillingForm extends GebReportingSpec {
    void enterCredentials(){
        given:
        browser.go("https://www.techlistic.com/p/selenium-practice-form.html")

        //Text box
        browser.$("input[name='firstname']").value("Anna")
        browser.$("input[name='lastname']").value "Chaika"
        browser.$("#datepicker") << ("08/03/1990")

        //Radio button
        browser.$("#sex-0").click()
        browser.$("#exp-0").click()

        //Checkbox
        browser.$("#profession-1").click()
        browser.$("#tool-2").click()

        //Drop-down
        browser.$("#continents").find("option").find{ it.value() == "Australia" }

        //Upload file
        //file is not image, just to show the concept
        browser.$("#photo").value("C:\\UserData\\repositories\\projects-from-internet\\geb-example-gradle - Copy")
    }
}
