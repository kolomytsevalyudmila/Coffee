import kotlin.math.sqrt


fun perimeter(x1: Double = 0.0, y1: Double = 0.0, x2: Double=0.0, y2: Double=0.0, x3: Double=0.0, y3: Double= 0.0, x4: Double=0.0, y4: Double=0.0): Double {
    var a = Math.hypot(x2-x1,y2-y1)
    var b = Math.hypot(x3-x2,y3-y2)
    var c = Math.hypot(x1-x3,y1-y3)

    if (y4==0.0 && x4==0.0) {

        var AB = sqrt((x2 - x1) * 2 + (y2 - y1) * 2)
        var BC = sqrt((x3 - x2) * 2 + (y3 - y2) * 2)
        var CA = sqrt((x1 - x3) * 2 + (y1 - y3) * 2)
        return AB+BC+CA
    } else {
        var AB = sqrt((x2 - x1) * 2 + (y2 - y1) * 2)
        var BC = sqrt((x3 - x2) * 2 + (y3 - y2) * 2)
        var CD = sqrt((x4 - x3) * 2 + (y4 - y3) * 2)
        var DA = sqrt((x1 - x4) * 2 + (y1 - y4) * 2)
        return AB+BC+CD+DA
}
}
//The second way to solve this is to:
// A(X1, Y1), B(X2, Y2), C(X3, Y3)
//,  D(X4=X1, Y4=Y1)