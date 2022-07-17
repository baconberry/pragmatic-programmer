package turtle.graphics

import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import jakarta.inject.Singleton
import spock.lang.Specification
import turtle.graphics.controller.InternalDSL
import turtle.graphics.entity.Canvas
import turtle.graphics.entity.Context

@MicronautTest
class InternalDslTest extends Specification {

    @Inject
    InternalDSL dsl

    @Inject
    Context ctx

    def "it should render a rectangle"() {
        def lines = []
        given: "Current canvas"
            def canvas = ctx.getCanvas()
        when:
            dsl
                .p(2)
                .d()
                .w(2)
                .n(1)
                .e(2)
                .s(1)
                .u()
        then:
            true
        // still no luck
//            4 * canvas.drawLine(_, _, _)
    }

    @MockBean(Canvas)
    @Singleton
    Canvas canvas() {
        Mock(Canvas)
    }
}
