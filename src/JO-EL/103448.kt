import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable numero que sera preguntada de nuevo en el bucle
    var numero:Int = scan.nextInt()
    // Inicializamos los contadores de numeros positivos y negativos que se iran sumando a lo largo del bucle
    var positivos_counter:Int = 0
    var negativos_counter:Int = 0
    // Arrancamos el bucle que no parara hasta que el usuario ponga como input "0"
    while (numero != 0) {
        // Si el numero es positivo, sumamos al contador de positivos y viceversa
        if (numero > 0) {
            ++positivos_counter
        } else {
            ++negativos_counter
        }
        // Escaneamos el siguiente numero
        numero = scan.nextInt()
    }
    // Imprimimos por pantalla si hay mas positivos, negativos o si hay la misma cantidad
    if (positivos_counter > negativos_counter){
        print("POSITIUS")
    } else if (positivos_counter < negativos_counter){
        print("NEGATIUS")
    } else {
        print("IGUALS")
    }
}