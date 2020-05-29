import geb.Browser
import pages.ContactUsPage

Browser.drive{

    to ContactUsPage

    println currentUrl

    enterName("Anna")

}
