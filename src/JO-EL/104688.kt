import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Preguntamos los millones de Harrison Ford
    val dineros:Int = scan.nextInt()
    // Inicializamos variables para el bucle for
    var millones:Int = dineros/1_000_000
    // Por cada millon en millones
    for (millon in 1..millones) {
        // Imprimimos el millon
        println(millon*1_000_000)
    }
}