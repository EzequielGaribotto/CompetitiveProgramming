import java.util.*
fun main() {
    // Definimos el scanner
    val scan = Scanner(System.`in`)
    // Escaneamos los numeros
    var a:Int = scan.nextInt()
    var b:Int = scan.nextInt()
    // Verificamos si son contiguos o no
    if ((a+1 == b) || (b+1 == a))
        println("SI")
    else
        println("NO")
}