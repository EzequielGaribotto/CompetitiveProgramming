import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos el daño inicial y la cantidad de explosiones
    var danyoInicial:Int = scan.nextInt()
    var explosionesArcanas:Int = scan.nextInt()
    // Inicializamos el sumador de daños
    var danyoTotal:Int = 0
    // Iniciamos el bucle for que por cada explosion arcana multiplicara y sumara el daño por el numero de explosion
    for (explosion in 1..explosionesArcanas){
        danyoTotal += danyoInicial*explosion
    }
    // Imprimimos por pantalla el daño total
    print(danyoTotal)
}