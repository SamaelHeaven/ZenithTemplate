package game

import zenith.core.Entity
import zenith.core.Renderer
import zenith.core.Scene
import zenith.core.Time
import zenith.drawable.Rectangle
import zenith.input.InputAxis
import zenith.input.Key
import zenith.input.Keyboard
import zenith.input.Mouse
import zenith.math.Vector2
import zenith.paint.Color
import java.util.*

class MyScene : Scene() {
    override fun initialize() {
        for (i in 0 until 50000) {
            val random = Random()
            val entity = Entity(
                position = Vector2(random.nextInt(1000), random.nextInt(1000)),
                scale = Vector2(100),
            )
            entity.addComponent(
                Rectangle(
                    entity = entity, fill = Color.RED, stroke = Color.BLACK, strokeWidth = 2f
                )
            )
            addEntity(entity)
        }
    }

    override fun update() {
        Renderer.clearBackground(Color.BLUE)
        camera.offset -= InputAxis.both.normalize() * 200 * Time.delta
        if (Keyboard.isKeyDown(Key.R)) {
            for (entity in this) {
                entity.rotation += 60 * Time.delta
            }
        }
        camera.zoom += Mouse.scroll.y * 10 * Time.delta
        println(Time.currentFPS)
    }
}