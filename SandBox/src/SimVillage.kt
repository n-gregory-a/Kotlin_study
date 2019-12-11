fun main() {
    runSimulation("Guyal") {playerName, numBuildings ->
        val currentYear = 2019
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"

    }

}

inline fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() // randomly choose 1, 2 or 3
    println(greetingFunction(playerName, numBuildings))
}
