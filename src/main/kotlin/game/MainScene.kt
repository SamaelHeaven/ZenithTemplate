package game

import zenith.core.Renderer
import zenith.core.Scene
import zenith.paint.Color

class MainScene : Scene() {
    override fun initialize() {
        println("Initializing")
    }

    override fun update() {
        println("Updating")
        Renderer.clearBackground(Color.BLUE)
    }
}