package modules

import geb.Module

class AbodeqaTabs extends Module{

    static content = {
        aboutUsTab(wait: true) { $("#mainnav-menu li#menu-item-1111 a") }
    }

    def clickOnAboutUsTab(){
        aboutUsTab.click()
    }
}
