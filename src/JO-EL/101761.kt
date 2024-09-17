import java.util.Scanner
fun main() {
    val scan = Scanner(System.`in`)
    // Inicializamos las cuatro variables que identificaran a las edades de los amores de bambino
    var a:Int = scan.nextInt()
    var b:Int = scan.nextInt()
    var c:Int = scan.nextInt()
    var n:Int = scan.nextInt()
    // Comprobamos si son iguales e imprimimos SI si son distintas y NO si existen 2 iguales
    if ((a == b || b == c || a == c) || (n == a || n == b || n == c)){
        print("NO")
    } else {(print("SI"))}
}