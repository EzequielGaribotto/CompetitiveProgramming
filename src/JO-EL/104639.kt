import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable enrere que sera el numero a partir del cual empezaremos a contar hacia atrás
    var enrere:Int = scan.nextInt()
    // Iniciamos el bucle que terminara cuando enrere sea 0
    repeat(enrere+1) {
        // Imprimimos el numero
        println(enrere)
        // Reducimos el numero en uno
        --enrere
    }
}