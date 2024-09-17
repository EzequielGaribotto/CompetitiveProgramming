import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable numeroN que seran los numeros introducidos por el usuario a lo largo del bucle
    var numeroN:Int = scan.nextInt()
    // Inicializamos las variables que guardaran los numeros mas grande y pequeño
    var numeroMasGrande:Int = numeroN
    var numeroMasPequeno:Int = numeroN
    // Repetiremos el bucle hasta que el usuario ponga "0"
    while (numeroN != 0) {
        // Comprobamos si el numero introducido por el usuario es el mas grande
        if (numeroN > numeroMasGrande) {
            numeroMasGrande = numeroN
        }
        // Comprobamos si el numero introducido por el usuario es el mas pequeño
        if (numeroN < numeroMasPequeno) {
            numeroMasPequeno = numeroN
        }
        // Escaneamos el siguiente numero
        numeroN = scan.nextInt()
    }
    // Una vez finalizado el bucle, imprimimos los numeros mas grande y pequeño
    print("$numeroMasGrande $numeroMasPequeno")
}