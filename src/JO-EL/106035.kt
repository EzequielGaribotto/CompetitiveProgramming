import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var carta1:Int = scan.nextInt() // Escaneamos la entrada del usuario
    var carta2:Int = scan.nextInt()
    var carta3:Int = scan.nextInt()
    // Comprobamos dos si son iguales entre sí
    if ((carta1 == carta2) || (carta1 == carta3) || (carta2 == carta3)) {
        println("SI")
    } else {
        println("NO")
    }
}