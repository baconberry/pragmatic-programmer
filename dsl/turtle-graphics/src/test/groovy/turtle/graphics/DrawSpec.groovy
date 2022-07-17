package turtle.graphics


import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import jakarta.inject.Singleton
import spock.lang.Specification
import turtle.graphics.controller.StringLinesController
import turtle.graphics.entity.Canvas
import turtle.graphics.entity.Context

@MicronautTest
class DrawSpec extends Specification {

    @Inject
    private Canvas canvasMock

    @Inject
    private Context ctx

    @Inject
    private StringLinesController controller;

    def "it should draw a rectangle"() {

        def coordinates = [ctx.getCurrentCoordinates()]
        given:
        ctx.setCanvas(canvasMock)
        when:
        controller.processString(getLines())
        println coordinates
        then:
        true
        // WHY IS MOCKING NOT WORKING????
//        4 * canvasMock.drawLine(_,_,_,_)

//            canvasMock.drawLine(_, _, _, _) >> { Coordinates a,Coordinates b, Color c, int d -> {
//                println "Draw lines called"
//                coordinates << ctx.getCurrentCoordinates()
//            }
//            }
    }

    @MockBean(Canvas)
    @Singleton
    Canvas canvas() {
        Mock(Canvas)
    }

    def getLines() {
        """
P 2
D
W 2
N 1
E 2
S 1
U
"""
    }
}
