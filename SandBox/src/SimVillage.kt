fun main() {
    val greetingFunction: (String) -> String = {
        val currentYear = 2019
        "Welcome to SimVillage, $it! (copyright $currentYear)"
    }

    println(greetingFunction("Guyal"))
}