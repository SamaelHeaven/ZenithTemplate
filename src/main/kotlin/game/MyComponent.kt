package game

import zenith.core.Component

class MyComponent : Component() {
    override fun start() {
        println("Starting component")
    }

    override fun update() {
        println("Updating component")
    }

    override fun destroy() {
        println("Destroying component")
    }
}