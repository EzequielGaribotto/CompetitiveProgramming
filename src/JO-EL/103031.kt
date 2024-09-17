import java.util.*

fun main() {
    // Definimos la variable escaner
    val scan = Scanner(System.`in`)
    // Inicializamos y preguntamos el año al usuario
    var anyo: Int = scan.nextInt()
    // Si el año es superior a 999 calculamos su modulo entre 1000
    if (anyo > 999) {
        anyo = anyo % 1000
    }
    // Si el año es superior a 99 calculamos su modulo entre 100
        if (anyo > 99) {
            anyo = anyo % 100
        }
    // El modulo nos dara un numero del 1 al 100
        if (anyo in 90..99) {
            print("SI")
        } else {
            print("NO")
    }
}