package net.codebuilders.mybusiness

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class AdminControllerSpec extends Specification implements ControllerUnitTest<AdminController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test action which renders text"() {
        when:
        controller.hello()               // <1>

        then:
        status == 200                    // <2>
        response.text == 'Hello, World!' // <3>
    }

}
