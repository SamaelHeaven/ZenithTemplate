package game

import zenith.core.Entity
import zenith.core.Prefab

class MyPrefab : Prefab() {
    override fun build(entity: Entity) {
        entity.addComponent(MyComponent())
    }
}