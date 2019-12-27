const val TAVERN_NAME = "Taernyl's Folly"

fun main() {

    placeOrder("shandy,Dragon's Breath,5.91")

}

fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Madrigal speak with $tavernMaster about his order.")

    val (type, name, price) = menuData.split(',')
    val message = "Madrigal buys a $name ($type) for $price."
    println(message)
}
