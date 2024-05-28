package game

import javafx.scene.paint.Color
import org.samaelheaven.zenith.core.Renderer
import org.samaelheaven.zenith.core.Scene

class MainScene : Scene() {
    override fun initialize() {
        println("Initializing")
    }

    override fun update() {
        println("Updating")
        Renderer.clearBackground(Color.BLUE)
    }
}