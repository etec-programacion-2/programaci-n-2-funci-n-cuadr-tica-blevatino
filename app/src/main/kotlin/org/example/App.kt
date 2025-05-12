package org.example

fun main() {
    val a: Double = 2.0
    val b: Double = 1.0
    val c: Double = -1.0

    if (a == 0.0){
        println("A no puede valer 0")
    }else {
        println("La funcion es f(x) = ${a}x² + ${b}x + $c")
        cuadratica(a, b, c)
    }
}
fun cuadratica(a: Double,b: Double, c: Double){
    println("\n|   X   |   Y   |")
    for (i in -5..5){
        println("|  $i  |  ${a*(Math.pow(i.toDouble(),2.0))+b*i+c}  |")
    }
}