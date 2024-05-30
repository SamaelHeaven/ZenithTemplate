package game

import zenith.core.Game
import zenith.core.Renderer
import zenith.core.Scene
import zenith.input.Key
import zenith.input.Keyboard
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
    }
}