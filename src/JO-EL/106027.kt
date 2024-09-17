import java.util.*
fun main() {
    // Definimos el scanner
    val scan = Scanner(System.`in`)
    // Escaneamos las variables
    var monte1:Int = scan.nextInt()
    var monte2:Int = scan.nextInt()
    var monte3:Int = scan.nextInt()
    var monte4:Int = scan.nextInt()
    var monte5:Int = scan.nextInt()
    // Creamos las condiciones que se tienen que cumplir para que los numeros hagan montañas
    if ((monte2 > monte1 && monte3 < monte2 && monte4 > monte3 && monte5 < monte4) || (monte2 < monte1 && monte3 > monte2 && monte4 < monte3 && monte5 > monte4)){
        println("SI")
    } else {
        println("NO")
    }
}