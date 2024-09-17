import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable repeticiones que sera el numero de veces que se repetira el bucle
    var repeticiones:Int = scan.nextInt()
    // Iniciamos el bucle
    repeat(repeticiones){
        // Inicializamos y preguntamos la variable numero que sera el numero que tendra que ser sumado
        var numero:Int = scan.nextInt()
        // Sumamos uno a var numero
        ++numero
        // Imprimimos el numero por pantalla
        println(numero)
    }
}