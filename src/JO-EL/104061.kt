import java.util.*

fun main() {
    // Definimos el escaner
    var scan = Scanner(System.`in`)
    // Inicializamos y preguntamos la variable numero_n que seran los numeros introducidos por el usuario a lo largo del bucle
    var numero_n:Int = scan.nextInt()
    // Inicializamos las variables que guardaran los numeros mas grande y pequeño
    var numero_mas_grande:Int = numero_n
    var numero_mas_pequeno:Int = numero_n
    // Repetiremos el bucle hasta que el usuario ponga "0"
    while (numero_n != 0) {
        // Comprobamos si el numero introducido por el usuario es el mas grande
        if (numero_n > numero_mas_grande) {
            numero_mas_grande = numero_n
        }
        // Comprobamos si el numero introducido por el usuario es el mas pequeño
        if (numero_n < numero_mas_pequeno) {
            numero_mas_pequeno = numero_n
        }
        // Escaneamos el siguiente numero
        numero_n = scan.nextInt()
    }
    // Una vez finalizado el bucle, imprimimos los numeros mas grande y pequeño
    print("$numero_mas_grande $numero_mas_pequeno")
}