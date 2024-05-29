package game

import org.samaelheaven.zenith.core.Game
import org.samaelheaven.zenith.core.GameConfig
import org.samaelheaven.zenith.utils.Resource

class Launcher {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val config = GameConfig(
                icon = Resource.url("icon.png")
            )
            Game.launch(MainScene(), config)
        }
    }
}