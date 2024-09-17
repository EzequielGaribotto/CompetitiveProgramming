import java.util.Scanner
fun main() {
    val scan = Scanner(System.`in`)
    // Inicializamos las cuatro variables que identificaran a las edades de los amores de bambino
    var ex1:Int = scan.nextInt()
    var ex2:Int = scan.nextInt()
    var ex3:Int = scan.nextInt()
    var interes:Int = scan.nextInt()
    // Comprobamos si son iguales
    if ((ex1 == ex2 || ex2 == ex3 || ex1 == ex3) || (interes == ex1 || interes == ex2 || interes == ex3)){
        print("NO")
    } else {
        print("SI")
    }
}