package game

import zenith.core.Game
import zenith.core.GameConfig
import zenith.io.Resource

object Launcher {
    @JvmStatic
    fun main(args: Array<String>) {
        val config = GameConfig(
            icon = Resource.url("icon.png")
        )
        Game.launch(MyScene(), config)
    }
}