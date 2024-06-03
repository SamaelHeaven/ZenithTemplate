package game

import zenith.core.Game
import zenith.core.Renderer
import zenith.core.Scene
import zenith.core.Time
import zenith.input.Key
import zenith.input.Keyboard
import zenith.input.Mouse
import zenith.math.Vector2
import zenith.paint.Color

class MainScene : Scene() {
    override fun initialize() {
        println("Initializing")
    }

    override fun update() {
        println("Updating")
        Renderer.clearBackground(Color.BLUE)
        if (Keyboard.isKeyPressed(Key.TAB)) {
            Game.fullscreen = !Game.fullscreen
        }
        if (Keyboard.isKeyPressed(Key.ESCAPE)) {
            Game.exit()
        }
        val cursorSpeed = 300 * Time.delta
        if (Keyboard.isKeyDown(Key.UP)) {
            Mouse.position += Vector2.UP * cursorSpeed
        }
        if (Keyboard.isKeyDown(Key.DOWN)) {
            Mouse.position += Vector2.DOWN * cursorSpeed
        }
        if (Keyboard.isKeyDown(Key.LEFT)) {
            Mouse.position += Vector2.LEFT * cursorSpeed
        }
        if (Keyboard.isKeyDown(Key.RIGHT)) {
            Mouse.position += Vector2.RIGHT * cursorSpeed
        }
    }
}