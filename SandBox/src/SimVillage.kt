fun main() {
    val greetingFunction: () -> String = {
        val currentYear = 2019
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }

    println(greetingFunction())
}