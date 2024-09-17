import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos la variable strikes que contara la cantidad de strikes de Jorge Salvaje
    var strike:Int = 0
    // Inicializamos la variabe video que contara la cantidad de videos que Jorge Salvaje subió antes del tercer strike
    var video:Int = 0
    // Iniciamos el bucle que terminara cuando llegue a 3 strikes
    while (strike < 3){
        // Preguntamos las visitas (o strike)
        var visitas:Int = scan.nextInt()
        // Si el input es distinto a -1 es un video
        if (visitas != -1) {
            ++video
        // Si el input es -1 es un strike
        } else {
            ++strike
        }
    }
    // Imprimimos la cantidad de videos subidos antes del strike
    print(video)
}