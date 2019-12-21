fun main() {
    var swordJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordJuggling = 2
    }

    try {
        proficiencyCheck(swordJuggling)
        swordJuggling = swordJuggling!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }

    println("You juggle $swordJuggling swords!")
}

fun proficiencyCheck(swordsJuggling: Int?) {
//    swordsJuggling ?: throw UnskilledSwordJugglingException()
    checkNotNull(swordsJuggling, { "Player cannot juggle swords" })
}

class UnskilledSwordJugglingException :
        IllegalMonitorStateException ("Player cannot juggle swords")