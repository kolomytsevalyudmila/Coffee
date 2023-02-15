

fun subtractTwoNumbers (a: Long, b: Long): Long {
    println(a - b)
    return a - b
}


fun sumTwoNumbers (a: Long, b: Long): Long {
    println(a + b)
    return a + b
}

fun divideTwoNumbers (a: Long, b: Long) {
    if (b.toDouble() == 0.0){
        println("Division by 0!")
    } else
        println(a / b)

}


fun multiplyTwoNumbers (a: Long, b: Long): Long {
    println(a * b)
    return a * b
}