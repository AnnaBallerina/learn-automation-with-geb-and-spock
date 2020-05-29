import geb.Browser
import geb.spock.GebReportingSpec

//don't know what is wrong with Browser.drive()

class driveMethodFromBrowser extends GebReportingSpec{
    void runMe(){
        Browser.drive{

            given:
            go("https://www.techlistic.com/p/selenium-practice-form.html")

            //Text box
            $("input[name='firstname']").value("Anna")
            $("input[name='lastname']").value "Chaika"
            $("#datepicker") << ("08/03/1990")

            //Radio button
            $("#sex-0").click()
            $("#exp-0").click()

            //Checkbox
            $("#profession-1").click()
            $("#tool-2").click()

            //Drop-down
            $("#continents").find("option").find{ it.value() == "Australia" }

            //Upload file
            //file is not image, just to show the concept
            $("#photo").value("C:\\UserData\\repositories\\projects-from-internet\\geb-example-gradle - Copy")
        }
    }
}

