enum class DangerLevel(val lev: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel():Int{
        return lev.toInt()
    }
}
fun main(){
    val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM

    println(high.getLevel() > medium.getLevel()) // true
}