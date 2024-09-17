import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var a1:Int = scan.nextInt()
    var a2:Int = scan.nextInt()
    var a3:Int = scan.nextInt()
    var a4:Int = scan.nextInt()
    var a5:Int = scan.nextInt()
    // Asignamos un valor a la variable dia en funcion del numero, para despues imprimir
    if ((a2 > a1 && a3 < a2 && a4 > a3 && a5 < a4) || (a2 < a1 && a3 > a2 && a4 < a3 && a5 > a4)){
        println("SI")
    } else {
        println("NO")
    }
}