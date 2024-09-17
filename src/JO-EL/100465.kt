import java.util.*
fun main() {
    // Definimos el scanner
    val scan = Scanner(System.`in`)
    // Escaneamos las variables
    var a1:Int = scan.nextInt()
    var a2:Int = scan.nextInt()
    var a3:Int = scan.nextInt()
    var a4:Int = scan.nextInt()
    var a5:Int = scan.nextInt()
    // Creamos las condiciones que se tienen que cumplir para que los numeros hagan montañas
    if ((a2 > a1 && a3 < a2 && a4 > a3 && a5 < a4) || (a2 < a1 && a3 > a2 && a4 < a3 && a5 > a4)){
        println("SI")
    } else {
        println("NO")
    }
}