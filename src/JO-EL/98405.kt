import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var a:Int = scan.nextInt() // Escaneamos la entrada del usuario
    var b:Int = scan.nextInt()
    // Determinamos que numero es mayor a cual para calcular la diferencia
    if (a>=b) {
        println(a - b)
    } else {
        println(b - a)
    }
}