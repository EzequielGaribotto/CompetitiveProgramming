import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    var f1:Int = scan.nextInt()
    var f2:Int = scan.nextInt()
    var f3:Int = scan.nextInt()
    // Si la felicidad del ultimo o penultimo dia restada por la del primer dia da numero negativo significa que la felicidad es descendiente
    if ((f3 - f1) < 0 || (f2 - f1) < 0){
        println("NO")
    // Si no es descendiente es ascendiente
    } else {
        println("SI")
    }
}