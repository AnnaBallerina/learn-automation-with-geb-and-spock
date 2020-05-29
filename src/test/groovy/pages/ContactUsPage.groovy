package pages

import geb.Page
import modules.AbodeqaTabs

class ContactUsPage extends Page{
    //static url
    static url = "/contact-us/"      // currentURL=baseURL+staticURL

    //At checker
    static at = {
        title == "Contact Us - Abode QA"
        $("h1.page-title").isDisplayed()
    }

    static content = {
        nameField(wait: true) { $("input.name") }
        emailField(wait: true) { $("input.email") }
        commentField(wait: true) { $("textarea.textarea") }
        submitButton(wait: true) { $("button.pushbutton-wide")}
        tabs(wait: 10) { module AbodeqaTabs }
    }

    def enterName(String name){
        nameField.value(name)
        assert nameField.value() == name
    }

    def enterEmail(String email){
        emailField.value(email)
        assert emailField.value() == email
    }

    def callClickMethodOfModuleClass(){
        tabs.clickOnAboutUsTab() // since the method is created or tabs.aboutUsTab.click()
    }

    def enterComment(String commentText){
        commentField.value(commentText)
        assert commentField.value() == commentText
    }

    def clickSubmitButton(){
        submitButton.click()
    }
}
