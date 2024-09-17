import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos el daño inicial y la vida del enemigo
    var danyoInicial:Int = scan.nextInt()
    var healthPoints:Int = scan.nextInt()
    // Iniciamos el contador de ataques
    var ataques:Int = 0
    // Iniciamos el sumador de daños
    var danyoSumar:Int = 0
    // Iniciamos el bucle que no parara de contar ataques hasta que la suma de daño supere la vida del rival
    while (danyoSumar<healthPoints){
        ++ataques
        danyoSumar += +danyoInicial*ataques
    }
    // Imprimimos los ataques necesitados para derrotar al rival por pantalla
    print(ataques)
}