import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable repeticiones que hara que el bucle se repita esa cantidad de veces
    var repeticiones:Int = scan.nextInt()
    // Inicializamos la variable numero
    var numero:Int
    // Inicializamos la variable contadorPositivos
    var contadorPositivos:Int = 0
    // Iniciamos el bucle que se repetirá hasta que se terminen las repeticiones
    repeat(repeticiones) {
        // Preguntamos un numero al usuario
        numero = scan.nextInt()
        // Si el numero es superior a 0, summamos una unidad al contador de numeros positivos
        if (numero>0) {
            ++contadorPositivos
        }
    }
    // Una vez finalizado el bucle imprimimos por pantalla la cantidad de numeros positivos
    print(contadorPositivos)
}