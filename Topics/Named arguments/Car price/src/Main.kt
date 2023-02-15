
fun carPrice(old: Int = 5, kilometers: Int = 100_000, maximumSpeed: Int = 120, automatic: Boolean = false){
    var priceNew = 20000
    val yearNew = 0

    if (old > 0) {
        priceNew -= old * 2000} else priceNew

    if (maximumSpeed < 120) {
        priceNew += (maximumSpeed - 120) * 100
        } else if (maximumSpeed >= 120) {
            priceNew += (maximumSpeed-120) * 100
        } else priceNew

    if (kilometers >= 10000) {
            priceNew -= 200 * (kilometers / 10000)
        } else priceNew
    if (!automatic) priceNew = priceNew else {priceNew += 1500}

    print(priceNew)
    }

