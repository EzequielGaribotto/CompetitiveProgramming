import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable repeticiones que hara que el bucle se repita esa cantidad de veces
    var repeticiones:Int = scan.nextInt()
    // Inicializamos las variables
    var ferreroRocher_pisos:Int
    var bombons:Int = 0

    // Iniciamos el bucle, que no parara hasta que se terminen las repeticiones
    repeat(repeticiones) {
        // Preguntamos los pisos de ferrero rocher
        ferreroRocher_pisos = scan.nextInt()
        // Por cada piso haremos su cuadrado y lo sumaremos a la variable bombons
        for (piso in 1..ferreroRocher_pisos){
            bombons += piso*piso
        }
        // Mostrar bombones por pantalla
        println(bombons)
        // Reiniciar la variable bombones
        bombons = 0
    }
}