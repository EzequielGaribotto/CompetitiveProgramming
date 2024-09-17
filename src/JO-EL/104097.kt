import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable repeticiones que sera el numero de veces que se repetira el bucle
    val repeticiones:Int = scan.nextInt()
    // Iniciamos el bucle
    repeat(repeticiones){
        // Inicializamos y preguntamos la variable string "patata" que sera el saludo para la foto
        var patata:String = scan.next()
        // Imprimimos el string por pantalla
        println(patata)
    }
}