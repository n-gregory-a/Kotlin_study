fun main() {
    val name = "Madrigal"
    val healthPoints = 89

    if  (healthPoints == 100) {
        println(name + " is in exelent condition!")
    } else if (healthPoints >= 90) {
        println(name + " has a few scratches.")
    } else if (healthPoints >= 75) {
        println(name + " has a minor wounds.")
    } else if (healthPoints >= 15) {
        println(name + " looks pretty hurt.")
    } else {
        println(name + " is in awful condition!")
    }
}