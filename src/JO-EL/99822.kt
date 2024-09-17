import java.util.*
fun main() {
    // Definir escaner e inicializar variable dia
    val scan = Scanner(System.`in`)
    var dia:Int = scan.nextInt()
    // Caso dia incorrecto
    if (dia !in 1..366) {
        println("Incorrecte!")
    // Caso dia año natural
    } else if (dia in 1..365) {
        println("Correcte per un any no bixest!")
    // Caso dia año bisiesto
    } else {
        println("Correcte per un any bixest!")};
}