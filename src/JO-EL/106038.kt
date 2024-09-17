import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var numeroA:Int = scan.nextInt() // Escaneamos la entrada del usuario
    var numeroB:Int = scan.nextInt()
    // Determinamos que numero es mayor a cual para calcular la diferencia
    if (numeroA>=numeroB) {
        println(numeroA - numeroB)
    } else {
        println(numeroB - numeroA)
    }
}