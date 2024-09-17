import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Preguntamos los millones de Harrison Ford
    val millones:Int = scan.nextInt()
    // Inicializamos variables para el bucle for
    var millon:Int = 1_000_000
    var dineros:Int = 0
    // Por cada millon en 1_000_000..millones a pasos de 1_000_000 unidades
    for (millon in millon..millones step millon) {
        // Sumamos a la variable dineros 1_000_000
        dineros += 1_000_000
        // Imprimimos dineros
        println(dineros)
    }
}