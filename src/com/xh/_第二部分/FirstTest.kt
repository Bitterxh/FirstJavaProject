package com.xh._第二部分

import jdk.nashorn.internal.runtime.regexp.joni.Config.log

data class Point(val x:Int, val y:Int){
    operator fun plus(other:Point):Point{
        return Point(x + other.x, y + other.y)
    }

    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }


}

operator fun Point.plus(other: Point):Point{
    return Point(x + other.x, y + other.y)
}
fun main(args: Array<String>){
    val p1 = Point(10,20)
    val p2 = Point(30, 40)
    log.println(p1 + p2)
    println("$p1, $p2")
}


