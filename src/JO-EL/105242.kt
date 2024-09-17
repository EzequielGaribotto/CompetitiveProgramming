import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable repeticiones que hara que el bucle se repita esa cantidad de veces
    var repeticiones:Int = scan.nextInt()
    // Inicializamos las variables
    var ferreroRocherPisos:Int
    var bombons:Int = 0

    // Iniciamos el bucle, que no parara hasta que se terminen las repeticiones
    repeat(repeticiones) {
        // Preguntamos los pisos de ferrero rocher
        ferreroRocherPisos = scan.nextInt()
        // Por cada piso haremos su cuadrado y lo sumaremos a la variable bombons
        for (piso in 1..ferreroRocherPisos){
            bombons += piso*piso
        }
        // Mostrar bombones por pantalla
        println(bombons)
        // Reiniciar la variable bombons
        bombons = 0
    }
}