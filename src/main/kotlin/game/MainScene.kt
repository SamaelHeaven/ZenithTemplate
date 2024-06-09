package game

import zenith.core.Renderer
import zenith.core.Scene
import zenith.core.Time
import zenith.fxml.FXML
import zenith.fxml.SceneNode
import zenith.input.*
import zenith.paint.Color
import kotlin.math.round

class MainScene : Scene() {
    override fun initialize() {
        val entities = FXML.load<SceneNode>("scene.fxml").loadEntities()
        addEntities(entities)
    }

    override fun update() {
        Renderer.clearBackground(Color.BLUE)
        camera.offset -= InputAxis.both.normalize() * 200 * Time.delta
        if (Keyboard.isKeyDown(Key.R)) {
            forEach { it.rotation += 60 * Time.delta }
        }
        camera.zoom += Mouse.scroll.y * 0.001f
        camera.zoom -= round(Gamepad[0].getAxis(GamepadAxis.RIGHT_Y)) * 2 * Time.delta
        camera.zoom = 0.01f.coerceAtLeast(camera.zoom)
    }
}