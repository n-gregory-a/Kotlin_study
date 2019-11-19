const val MAX_EXPERIENCE: Int = 5000

fun main() {
    val playerName = "Estragon"
    var experiencePoints = 5

    var hasSteed = false
    var gold = 50
    val tavernName = "Unicorn horn"
    var beverages: List<String> = listOf("mead", "wine", "bear")

    experiencePoints += 5
    println("Experience points: $experiencePoints")
    println("Player name is $playerName")

    println("Player has a horse: $hasSteed")
    println("Player has $gold gold")
    println("Player in $tavernName tavern")

    println("Mirror: " + playerName.reversed())
}