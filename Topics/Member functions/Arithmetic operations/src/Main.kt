class ArithmeticOperations(private var x: Int, private var y: Int){


    fun addition(): Int {
        val res = this.x + this.y
        return(res)
    }

    fun subtraction(): Int {
        val res = this.y - this.x
        return(res)
    }
    fun multiplication(): Int{
        val res = this.x * this.y
        return (res)
    }
    fun division(): Int{
        val res = this.x / this.y
        return (res)
    }
}