import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos la variable numero_pruebas que sera la cantidad de veces que se hara el bucle
    var numero_pruebas:Int = scan.nextInt()
    // Inicializamos la variable numero_k que debera ser un entero positivo
    var numero_k:Int
    // Inicializamos el valor inicial de los pares
    var pares:Int = 0
    // Inicializamos el valor inicial de los impares
    var impares:Int = 0
    // Arrancamos el bucle que no parara hasta que el numero deje de ser entero positivo
    while (numero_pruebas > 0) {
        numero_k = scan.nextInt()
        while (numero_k > 0) {
            // Si el modulo del numero_k entre 2 es superior a 0 será impar, sumamos a la variable
            if ((numero_k % 2) > 0) {
                impares = impares + numero_k
                // Por el contrario será par, sumamos a la variable
            } else {
                pares = pares + numero_k
            }
            // Reducimos el numero k en una unidad por cada iteracion del bucle hasta que sea negativo
            --numero_k
        }
        // Imprimimos la cantidad de pares e impares por pantalla
        println("PARELLS: $pares SENARS: $impares")
        pares = 0
        impares = 0
        --numero_pruebas
    }
}