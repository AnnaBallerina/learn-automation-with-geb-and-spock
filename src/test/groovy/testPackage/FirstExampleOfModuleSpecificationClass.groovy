package testPackage

import geb.spock.GebSpec
import pages.ContactUsPage

class FirstExampleOfModuleSpecificationClass extends GebSpec{

    def exampleToUseModule(){

        given:
        println "We are going to see the example of using module class"

        when:
        to ContactUsPage
        callClickMethodOfModuleClass()

        then:
        println title
    }
}
