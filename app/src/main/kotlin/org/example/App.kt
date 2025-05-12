package org.example

fun main() {
    val a: Double = 2.1
    val b: Double = 1.0
    val c: Double = -1.0

    if (a == 0.0){
        println("A no puede valer 0")
    }else {
        println("La funcion es f(x) = ${a}x² + ${b}x + $c")
        cuadratica(a, b, c)
        raices(a,b,c)
    }
}
fun cuadratica(a: Double,b: Double, c: Double){
    println("\n|   X   |   Y   |")
    for (i in -5..5){
        println("|  $i  |  ${a*(Math.pow(i.toDouble(),2.0))+b*i+c}  |")
    }
}

fun discriminante(a: Double,b: Double, c: Double) : Double{
    return ((Math.pow(b,2.0))-4*a*c)
}

fun raices (a: Double,b: Double, c: Double) {
    if (discriminante(a, b, c) >= 0) {
        println("X1 = ${String.format("%.2f",(-b + (Math.pow(discriminante(a, b, c), (1.0 / 2.0)))) / (2.0 * a))}")
        println("X2 = ${String.format("%.2f",(-b - (Math.pow(discriminante(a, b, c), (1.0 / 2.0)))) / (2.0 * a))}")
    }else {
        println("No tiene raices")
    }
}