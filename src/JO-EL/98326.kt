import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var c1:Int = scan.nextInt() // Escaneamos la entrada del usuario
    var c2:Int = scan.nextInt()
    var c3:Int = scan.nextInt()
    // Comprobamos dos si son iguales entre sí
    if ((c1 == c2) || (c1 == c3) || (c2 == c3)) {
        println("SI")
    } else {
        println("NO")
    }
}