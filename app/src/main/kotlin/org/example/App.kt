package org.example

fun main() {
    // Valores de la parábola
    val a: Double = 2.0
    val b: Double = 4.0
    val c: Double = -1.0


    if (a == 0.0){ // Función Incorrecta
        println("A no puede valer 0")

    }else { // Función correcta
        println("La funcion es f(x) = ${a}x² + ${b}x + $c")
        cuadratica(a, b, c) // Tabla de valores
        raices(a,b,c) // Valores Raices

        //Tipos de Raices
        if (discriminante(a,b,c) > 0.0){
            println("Dos Raices Reales Diferentes")
        }else{
            if (discriminante(a,b,c) == 0.0){
                println("Una Raíz Real doble")
            }else{
                print("")
            }
        }
    }
}
fun cuadratica(a: Double,b: Double, c: Double){ //Tabla de valores
    println("\n|    X    |    Y    |")
    for (i in -5..5){
        println("|  ${(String.format("%.2f",i.toDouble()))}  |  ${(String.format("%.2f",(a*(Math.pow(i.toDouble(),2.0))+b*i+c)))}  |")
    }
}

fun discriminante(a: Double,b: Double, c: Double) : Double{ // Cálculo del Discriminante
    return ((Math.pow(b,2.0))-4*a*c)
}

fun raices (a: Double,b: Double, c: Double) { // Cálculo de raices
    if (discriminante(a, b, c) >= 0) {
        println("X1 = ${String.format("%.2f",(-b + (Math.pow(discriminante(a, b, c), (1.0 / 2.0)))) / (2.0 * a))}")
        println("X2 = ${String.format("%.2f",(-b - (Math.pow(discriminante(a, b, c), (1.0 / 2.0)))) / (2.0 * a))}")
    }else {
        println("No tiene raices reales") // Si no tiene Raiz
    }
}