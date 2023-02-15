package machine
var newWater = 400
var newCoffee = 120
var newMilk = 540
var newCups = 9
var newCash = 550

fun main() {
    println()
    println("Write action(buy, fill, take, remaining, exit):")

    when (readln()) {
        "buy" -> buy()
        "fill" -> fill()
        "take" -> take()
        "remaining" -> remaining()
        "exit" -> exit()
    }
}
fun buy(){

            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")

            when (readln()) {
                "1" -> {
                    if ((newWater >= 250)&&(newCoffee >= 16)&&(newCups > 0)){
                        newWater -= 250
                        newCoffee -= 16
                        newCups -= 1
                        newCash += 4
                        println("I have enough resources, making you a coffee!")
                    } else if (newWater < 250) println("Sorry, not enough water!")
                    else if (newCoffee < 16) println("Sorry, not enough coffee!")
                    else if (newCups <= 0)println("Sorry, not enough cups!")
                }

                "2" -> {
                    if ((newWater >= 350)&&(newCoffee >= 20)&&(newMilk >= 75)&&(newCups > 0)){
                        newWater -= 350
                        newCoffee -= 20
                        newCups -= 1
                        newMilk -= 75
                        newCash += 7
                        println("I have enough resources, making you a coffee!")
                    } else if (newWater < 350) println("Sorry, not enough water!")
                    else if (newCoffee < 20) println("Sorry, not enough coffee!")
                    else if (newCups <= 0) println("Sorry, not enough cups!")
                    else if (newMilk < 75) println("Sorry, not enough milk!")

                }

                "3" -> {
                    if ((newWater >= 200)&&(newCoffee >= 12)&&(newMilk >= 100)&&(newCups > 0)){
                        newWater -= 200
                        newCoffee -= 12
                        newCups -= 1
                        newMilk -= 100
                        newCash += 6
                        println("I have enough resources, making you a coffee!")
                    } else if (newWater < 2000) println("Sorry, not enough water!")
                    else if (newCoffee < 12) println("Sorry, not enough coffee!")
                    else if (newCups <= 0) println("Sorry, not enough cups!")
                    else if (newMilk < 100) println("Sorry, not enough milk!")

                }
                "back" -> main()
            }
            println()

            main()

        }
fun fill(){
            println("Write how many ml of water you want to add: ")
            newWater += readln().toInt()
            println("Write how many ml of milk you want to add: ")
            newMilk += readln().toInt()
            println("Write how many grams of coffee beans you want to add: ")
            newCoffee += readln().toInt()
            println("Write how many disposable cups you want to add: ")
            newCups += readln().toInt()

            println()

            main()

        }
fun take(){
            println("I gave you $$newCash")
            newCash = 0
            println()

            main()

            }
fun remaining(){
    println()
    println("The coffee machine has:\n" +
            "$newWater ml of water\n" +
            "$newMilk ml of milk\n" +
            "$newCoffee g of coffee beans\n" +
            "$newCups disposable cups\n" +
            "\$$newCash of money")
    main()
}
fun exit(){
    System.exit(0)
}



