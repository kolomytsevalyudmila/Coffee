import java.time.DayOfWeek

public enum class DaysOfTheWeek() {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

fun main(str: Array<String>) {
    var str = enumValues<DaysOfTheWeek>()
    println(str[0])
    println(str[1])
    println(str[2])
    println(str[3])
    println(str[4])
    println(str[5])
    println(str[6])
    // write here
}