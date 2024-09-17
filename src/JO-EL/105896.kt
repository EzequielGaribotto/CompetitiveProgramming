import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos la variable numeroPruebas que sera la cantidad de veces que se hara el bucle
    var numeroPruebas:Int = scan.nextInt()
    // Inicializamos la variable numeroK que debera ser un entero positivo
    var numeroK:Int
    // Inicializamos las variables pares e impares
    var pares:Int
    var impares:Int
    // Arrancamos el bucle que no parara hasta que el numero deje de ser entero positivo
    while (numeroPruebas > 0) {
        // Damos un valor inicial a pares e impares
        pares = 0
        impares = 0
        numeroK = scan.nextInt()
        // Preguntamos al usuario el numeroK
        while (numeroK > 0) {
            // Si el modulo del numeroK entre 2 es superior a 0 será impar, sumamos a la variable impares
            if ((numeroK % 2) > 0) {
                impares = impares + numeroK
                // Por el contrario será par, sumamos a la variable pares
            } else {
                pares = pares + numeroK
            }
            // Reducimos el numeroK en una unidad por cada iteracion del bucle hasta que sea negativo
            --numeroK
        }
        // Imprimimos la cantidad de pares e impares por pantalla
        println("PARELLS: $pares SENARS: $impares")
        // Reducimos el numeroPruebas en una unidad por cada iteracion del bucle, hasta que sea negativo
        --numeroPruebas
    }
}