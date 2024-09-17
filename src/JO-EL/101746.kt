import java.util.Scanner
fun main() {
    val scan = Scanner(System.`in`)
    // Inicializamos las tres variables que identificaran a las cartas
    var c1:Int = scan.nextInt()
    var c2:Int = scan.nextInt()
    var c3:Int = scan.nextInt()
    // Comprobamos si son iguales
    if (c1 == c2 && c2 == c3)
        print("SI")
    else
        print("NO")
}