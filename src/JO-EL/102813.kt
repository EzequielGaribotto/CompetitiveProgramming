import java.util.*

fun main() {
    // Definimos la variable escaner
    val scan = Scanner(System.`in`)
    // Inicializamos las variables que identificaran la hora del dia que introducira el usuario
    var hores:Int = scan.nextInt()
    var minuts:Int = scan.nextInt()
    var segons:Int = scan.nextInt()
    // Determinamos si la hora introducida por el usuario es correcta o no fijandonos en si pertenecen a un rango de numeros estricto
    if (hores in 0..23 && minuts in 0..59 && segons in 0..59) {
        print("SI")
    } else {
        print("NO")
    }
}