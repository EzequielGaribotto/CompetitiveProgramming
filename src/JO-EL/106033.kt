import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var numero:Double = scan.nextDouble() // Escaneamos la entrada del usuario
    var numeroEnter:Int = numero.toInt()
    // Solo es necesario comprobar la division entre 9, 8, 7 y 5 ya que estas implican que el resto son posibles
    if (((numero / 9) > (numeroEnter / 9)) || ((numero / 8) > (numeroEnter / 8)) || ((numero / 7) > (numeroEnter / 7)) || ((numero / 5) > (numeroEnter / 5))) {
    // Imprimimos respuesta en funcion de si es divisible por 1-9
        println("NO")
    } else {
        println("SI")
    }
}