package testPackage

import geb.spock.GebSpec
import pages.*

/*
 * 1 - extend with specification class (was Specification from Spock)
 * 2 - implicit calling if browser instance (browser from Geb)
 * both these things are in class that combines geb+spock (geb-pock dependency)
 */
class FirstGebSpockTestCaseSpecificationClass extends GebSpec{
    def "Fill Contact Us form an click on Submit button"(){
        // Feature method is going to have some short of blocks like given, when, then, where, expect

        given:
        println "We are in given block"

        when:
        // to    call the page
        to ContactUsPage
        enterName("Anna")
        enterEmail("test@gmail.com")
        enterComment("Testing automation with Geb and Spock")

        and:
        clickSubmitButton()

        then:
        at MessageSubmittedPage
    }
}
