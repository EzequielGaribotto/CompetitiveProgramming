import java.util.*

fun main() {
    // Definimos el escaner
    val scan = Scanner(System.`in`)
    // Inicializamos la variable nota
    var nota:Int = 0
    // Inicializamos el contador de notas correctas
    var notas_counter:Int = 0
    // Inicializamos el contador de notas de 10
    var notas_diez:Int = 0
    // Arrancamos el bucle que no parara hasta que el usuario de como input "-1"
    while (nota != -1) {
        // Escaneamos la nota
        nota = scan.nextInt()
        // Si la nota es 10 sumamos una al contador
        if (nota == 10) {
            ++notas_diez
        }
        // Si la nota no esta entre 0 y 10 no es valida por lo tanto no sumara al contador
        if (nota in 0..10) {
            ++notas_counter
        }
    }
    print("TOTAL NOTES: $notas_counter NOTES10: $notas_diez")
}