fun main() {
    val timerValue = readln().toInt()
    val timer = ByteTimer(timerValue.toByte())
    println(timer.time)
}

class ByteTimer(var time: Byte) {
}