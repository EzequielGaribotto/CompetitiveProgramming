import java.util.*

fun main() {
    // Definimos el escaner
    val scan = Scanner(System.`in`)
    // Inicializamos la variable nota
    var nota:Int = scan.nextInt()
    // Inicializamos el contador de notas correctas
    var notasCounter:Int = 0
    // Inicializamos el contador de notas de 10
    var notasDiez:Int = 0
    // Arrancamos el bucle que no parara hasta que el usuario de como input "-1"
    while (nota != -1) {
        // Si la nota es 10 sumamos una al contador
        if (nota == 10) {
            ++notasDiez
        }
        // Si la nota no esta entre 0 y 10 no es valida por lo tanto no sumara al contador
        if (nota in 0..10) {
            ++notasCounter
        }
        // Escaneamos la siguiente nota
        nota = scan.nextInt()
    }
    print("TOTAL NOTES: $notasCounter NOTES10: $notasDiez")
}