import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos el daño inicial y la cantidad de explosiones
    var repeticiones:Int = scan.nextInt()
    // Inicializamos las variables que utilizaremos para calcular la suma de ferreros de los pisos
    var numeroPisos:Int
    var ferrerosNecesarios:Int
    var sumaPisos:Int
    // Iniciamos el bucle que se repetira tantas veces como indique el usuario
    repeat(repeticiones){
        ferrerosNecesarios = 0 // Iniciamos las variables
        sumaPisos = 0
        numeroPisos = scan.nextInt() // Preguntamos al usuario los pisos
        // Iniciamos el for que por cada piso calculara sus ferreros necesarios y los sumara a la variable sumaPisos
        for (piso in 0..numeroPisos){
            ferrerosNecesarios += piso
            sumaPisos += ferrerosNecesarios
        }
        // Imprimimos la cantidad total de ferreros necesarios por piso
        println(sumaPisos)
    }
}