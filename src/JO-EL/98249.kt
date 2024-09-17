import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var numero:Double = scan.nextDouble() // Escaneamos la entrada del usuario
    var numero_enter:Int = numero.toInt()
    if (((numero / 9) > (numero_enter / 9)) || ((numero / 8) > (numero_enter / 8)) || ((numero / 7) > (numero_enter / 7)) || ((numero / 5) > (numero_enter / 5))) {
        // Imprimimos respuesta en funcion de si es divisible por 1-9
        println("NO")
    } else {
        println("SI")
    }
}