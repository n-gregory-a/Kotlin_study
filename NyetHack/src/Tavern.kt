const val TAVERN_NAME = "Taernyl's Folly"

fun main() {

    placeOrder("shandy,Dragon's Breath,5.91")

}

fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Madrigal speak with $tavernMaster about his order.")

    val data = menuData.split(',')
    val type = data[0]
    val name = data[1]
    val price = data[2]
    val message = "Madrigal buys a $name ($type) for $price."
    println(message)
}
