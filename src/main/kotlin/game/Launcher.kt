package game

import zenith.core.Game
import zenith.core.GameConfig
import zenith.utils.Resource

object Launcher {
    @JvmStatic
    fun main(args: Array<String>) {
        val config = GameConfig(
            icon = Resource.url("icon.png")
        )
        Game.launch(MainScene(), config)
    }
}