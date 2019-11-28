fun main() {
    val name = "Madrigal"
    val healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    // aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    val karma = formatKarmaStatus(healthPoints)
    // player state
    println("(Aura: $auraColor) " + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus and has $karma karma")
}

private fun formatKarmaStatus(healthPoints: Int): String {
    return when ((Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()) {
        in 16..20 -> "GREEN"
        in 11..15 -> "PURPLE"
        in 6..10 -> "ORANGE"
        else -> "RED"
    }

}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
    return when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quit quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
}