fun main() {
    runSimulation()
    }


fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
}

//fun printConstructionCost(numBuilding: Int) {
//    val cost = 500
//    println("construction cost: ${cost * numBuilding}")
//}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2019
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}
