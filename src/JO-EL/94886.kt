import java.util.*
fun main() {
    // Definir escaner
    val scan = Scanner(System.`in`)
    // Escanear altura, base y calcular area
    var altura:Float = scan.nextFloat()
    var base:Float = scan.nextFloat()
    var area = ((base * altura) / 2)
    // Imprimir el area
    println(area)
}