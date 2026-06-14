package Buildings

open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T : BaseBuildingMaterial>(
    private val buildingMaterial: T
) {

    private val baseMaterialsNeeded = 100

    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build() {
        println(
            "$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required"
        )
    }
}


fun <T : BaseBuildingMaterial> isSmallBuilding(
    building: Building<T>
) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}