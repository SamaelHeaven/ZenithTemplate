package game

import zenith.core.Entity
import zenith.core.Game
import zenith.core.Renderer
import zenith.core.Scene
import zenith.fxml.FXML
import zenith.fxml.SceneNode
import zenith.input.Key
import zenith.input.Keyboard
import zenith.paint.Color

class MyScene : Scene() {
    override fun initialize() {
        val entities = FXML.load<SceneNode>("scene.fxml").loadEntities()
        addEntities(entities)
    }

    override fun update() {
        Renderer.clearBackground(Color.BLUE)
        if (Keyboard.isKeyPressed(Key.TAB)) {
            Game.fullscreen = !Game.fullscreen
        }
        if (Keyboard.isKeyPressed(Key.ESCAPE)) {
            Game.exit()
        }
        if (Keyboard.isKeyPressed(Key.BACK_SPACE)) {
            removeEntities<Entity>()
        }
    }
}