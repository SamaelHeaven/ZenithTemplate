package game

import org.samaelheaven.zenith.core.Game
import org.samaelheaven.zenith.core.GameConfig
import org.samaelheaven.zenith.utils.Resource

object Launcher {
    @JvmStatic
    fun main(args: Array<String>) {
        val config = GameConfig(
            icon = Resource.url("icon.png")
        )
        Game.launch(MainScene(), config)
    }
}