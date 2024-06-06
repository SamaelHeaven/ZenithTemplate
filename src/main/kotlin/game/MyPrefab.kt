package game

import zenith.core.Entity
import zenith.prefab.Prefab

class MyPrefab : Prefab() {
    override var name: String
        get() = "MyEntity"
        set(_) {}

    override fun build(entity: Entity) {
        entity.addComponent(MyComponent())
    }
}